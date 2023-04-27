select count(USER_ID) 'USERS'
    from USER_INFO
    where AGE >= 20 and AGE <= 29 and JOINED like '2021%'