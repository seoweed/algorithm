select count(distinct NAME) 'count'
    from ANIMAL_INS
    where NAME is not null