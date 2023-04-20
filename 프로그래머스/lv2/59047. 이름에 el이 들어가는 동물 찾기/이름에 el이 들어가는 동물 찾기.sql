select ANIMAL_ID, NAME
    from ANIMAL_INS
    where NAME like '%el%' and ANIMAL_TYPE = 'dog'
    order by NAME;