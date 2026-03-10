-- 1. Check if the number the user gives is even

DECLARE
    x INT := &number;
BEGIN
    IF x MOD 2 = 0 THEN
        dbms_output.put_line(x || ' is even');
    ELSE
        dbms_output.put_line(x || ' is odd');
    END IF;
END;


-- 2. Show the numbers from 1 to 100

DECLARE
    i INT := 1;
BEGIN
    LOOP
        dbms_output.put_line(i);
        i := i + 1;
    EXIT WHEN i = 101;
    END LOOP;
END;


-- 3. Show the numbers to 100 to 1

DECLARE
    i INT := 100;
BEGIN
    LOOP
        dbms_output.put_line(i);
        i := i - 1;
    EXIT WHEN i = 0;
    END LOOP;
END;


-- 4. Show the even numbers to from 1 to 100

DECLARE
    i INT := 2;
BEGIN
    LOOP
        dbms_output.put_line(i);
        i := i + 2;
    EXIT WHEN i >= 101;
    END LOOP;
END;


-- 5. Show the odd numbers to from 1 to 100

DECLARE
    i INT := 1;
BEGIN
    LOOP
        dbms_output.put_line(i);
        i := i + 2;
    EXIT WHEN i >= 101;
    END LOOP;
END;


-- 6. Print the sum of all the numbers from 1 to 100

DECLARE
    i INT := 0;
    result INT := 0;
BEGIN
    LOOP
        i := i + 1;
        result := result + i;
    EXIT WHEN i = 101;
    END LOOP;
    
    dbms_output.put_line(result);
END;


-- 7. Print the sum of all the even numbers from 1 to 100

DECLARE
    i INT := 0;
    result INT := 0;
BEGIN
    LOOP
        i := i + 2;
        result := result + i;
    EXIT WHEN i >= 101;
    END LOOP;
    
    dbms_output.put_line(result);
END;


-- 8. Print the sum of all the odd numbers from 1 to 100

DECLARE
    i INT := 1;
    result INT := 0;
BEGIN
    LOOP
        result := result + i;
        i := i + 2;
    EXIT WHEN i >= 101;
    END LOOP;
    
    dbms_output.put_line(result);
END;