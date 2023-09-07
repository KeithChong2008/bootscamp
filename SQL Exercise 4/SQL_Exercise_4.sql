use sys;
create table players (
    player_id integer not null unique, 
    group_id integer not null
);

create table matches (
    match_id integer not null unique, 
    first_player integer not null, 
    second_player integer not null, 
    first_score integer not null, 
    second_score integer not null
);

delete from players;
delete from matches;

insert into players values (20, 2);
insert into players values (30, 1);
insert into players values (40, 3);
insert into players values (45, 1);
insert into players values (50, 2);
insert into players values (65, 1);

insert into matches values (1, 30, 45, 10, 12);
insert into matches values (2, 20, 50, 5, 5);
insert into matches values (13, 65, 45, 10, 10);
insert into matches values (5, 30, 65, 3, 15);
insert into matches values (42, 45, 65, 8, 4);


SELECT group_id, MIN(player_id) AS winner_id
FROM (
    SELECT p.group_id, p.player_id, SUM(COALESCE(m.first_score, 0) + COALESCE(m.second_score, 0)) AS total_score
    FROM players p
    LEFT JOIN matches m ON p.player_id IN (m.first_player, m.second_player)
    GROUP BY p.group_id, p.player_id
) AS group_scores
WHERE total_score = (
    SELECT MAX(total_score)
    FROM (
        SELECT p.group_id, p.player_id, SUM(COALESCE(m.first_score, 0) + COALESCE(m.second_score, 0)) AS total_score
        FROM players p
        LEFT JOIN matches m ON p.player_id IN (m.first_player, m.second_player)
        GROUP BY p.group_id, p.player_id
    ) AS max_scores
    WHERE max_scores.group_id = group_scores.group_id
)
GROUP BY group_id
ORDER BY group_id;

