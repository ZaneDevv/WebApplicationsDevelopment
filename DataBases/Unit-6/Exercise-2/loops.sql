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

-- Normal loop
DECLARE
    i INT := 1;
BEGIN
    LOOP
        dbms_output.put_line(i);
        i := i + 1;
    EXIT WHEN i = 101;
    END LOOP;
END;

-- While loop
DECLARE
    i INT := 1;
BEGIN
    WHILE i <= 100 LOOP
        dbms_output.put_line(i);
        i := i + 1;
    END LOOP;
END;


-- For loop
BEGIN
    FOR i IN 1..100 LOOP
        dbms_output.put_line(i);
    END LOOP;
END;




-- 3. Show the numbers to 100 to 1

-- Normal loop
DECLARE
    i INT := 100;
BEGIN
    LOOP
        dbms_output.put_line(i);
        i := i - 1;
    EXIT WHEN i = 0;
    END LOOP;
END;


-- While loop
DECLARE
    i INT := 100;
BEGIN
    WHILE i > 0 LOOP
        dbms_output.put_line(i);
        i := i - 1;
    END LOOP;
END;


-- For loop
BEGIN
    FOR i IN REVERSE 1..100 LOOP
        dbms_output.put_line(i);
    END LOOP;
END;



-- 4. Show the even numbers from 1 to 100

--  Normal loop
DECLARE
    i INT := 2;
BEGIN
    LOOP
        dbms_output.put_line(i);
        i := i + 2;
    EXIT WHEN i >= 101;
    END LOOP;
END;


-- While loop
DECLARE
    i INT := 2;
BEGIN
    WHILE i <= 100 LOOP
        dbms_output.put_line(i);
        i := i + 2;
    END LOOP;
END;


-- For loop
BEGIN
    FOR i IN 1..100 LOOP
        IF i MOD 2 = 0 THEN
            dbms_output.put_line(i);
        END IF;
    END LOOP;
END;



-- 5. Show the odd numbers to from 1 to 100

-- Normal loop
DECLARE
    i INT := 1;
BEGIN
    LOOP
        dbms_output.put_line(i);
        i := i + 2;
    EXIT WHEN i > 100;
    END LOOP;
END;

-- While loop
DECLARE
    i INT := 1;
BEGIN
    WHILE i <= 100 LOOP
        dbms_output.put_line(i);
        i := i + 2;
    END LOOP;
END;

-- For loop
BEGIN
    FOR i IN 1..100 LOOP
        IF i MOD 2 = 1 THEN
            dbms_output.put_line(i);
        END IF;
    END LOOP;
END;


-- 6. Print the sum of all the numbers from 1 to 100

-- Normal loop
DECLARE
    i INT := 0;
    result INT := 0;
BEGIN
    LOOP
        i := i + 1;
        result := result + i;
    EXIT WHEN i = 100;
    END LOOP;
    
    dbms_output.put_line(result);
END;

-- While loop
DECLARE
    i INT := 1;
    result INT := 0;
BEGIN
    WHILE i <= 100 LOOP
        result := result + i;
        i := i + 1;
    END LOOP;
    
    dbms_output.put_line(result);
END;

-- For loop
DECLARE
    result INT := 0;
BEGIN
    FOR i IN 1..100 LOOP
        result := result + i;
    END LOOP;
    
    dbms_output.put_line(result);
END;


-- 7. Print the sum of all the even numbers from 1 to 100

-- Normal loop
DECLARE
    i INT := 0;
    result INT := 0;
BEGIN
    LOOP
        i := i + 2;
        result := result + i;
    EXIT WHEN i >= 100;
    END LOOP;
    
    dbms_output.put_line(result);
END;

-- While loop
DECLARE
    i INT := 2;
    result INT := 0;
BEGIN
    WHILE i <= 100 LOOP
        result := result + i;
        i := i + 2;
    END LOOP;
    
    dbms_output.put_line(result);
END;

-- For loop
DECLARE
    result INT := 0;
BEGIN
    FOR i IN 1..100 LOOP
        IF i MOD 2 = 0 THEN
            result := result + i;
        END IF;
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

-- While loop
DECLARE
    i INT := 1;
    result INT := 0;
BEGIN
    WHILE i <= 100 LOOP
        result := result + i;
        i := i + 2;
    END LOOP;
    
    dbms_output.put_line(result);
END;

-- For loop
DECLARE
    result INT := 0;
BEGIN
    FOR i IN 1..100 LOOP
        IF i MOD 2 = 1 THEN
            result := result + i;
        END IF;
    END LOOP;
    
    dbms_output.put_line(result);
END;


-- 9. Print the sum of all even numbers from 1 to 100 and how many there are.

-- Normal loop
DECLARE
    totalSum INT := 0;
    numbersAmount INT := 0;
    i INT := 2;
BEGIN
    LOOP
        totalSum := totalSum + i;
        numbersAmount := numbersAmount + 1;
        i := i + 2;
    EXIT WHEN i > 100;
    END LOOP;
    
    dbms_output.put_line('Numbers amount: ' || TO_CHAR(numbersAmount) || ', total sum: ' || TO_CHAR(totalSum));
END;

-- While loop
DECLARE
    totalSum INT := 0;
    numbersAmount INT := 0;
    i INT := 2;
BEGIN
    WHILE i <= 100 LOOP
        numbersAmount := numbersAmount + 1;
        totalSum := totalSum + i;
        i := i + 2;
    END LOOP;

    dbms_output.put_line('Numbers amount: ' || TO_CHAR(numbersAmount) || ', total sum: ' || TO_CHAR(totalSum));
END;

-- For loop
DECLARE
    totalSum INT := 0;
    numbersAmount INT := 0;
BEGIN
    FOR i IN 1..100 LOOP
        IF i MOD 2 = 0 THEN
            totalSum := totalSum + i;
            numbersAmount := numbersAmount + 1;
        END IF;
    END LOOP;
    
    dbms_output.put_line('Numbers amount: ' || TO_CHAR(numbersAmount) || ', total sum: ' || TO_CHAR(totalSum));
END;


-- 10. Print the sum of all odd numbers from 1 to 100 and how many there are.

DECLARE
    totalSum INT := 0;
    numbersAmount INT := 0;
    i INT := 1;
BEGIN
    LOOP
        totalSum := totalSum + i;
        numbersAmount := numbersAmount + 1;
        i := i + 2;
    EXIT WHEN i > 100;
    END LOOP;
    
    dbms_output.put_line('Numbers amount: ' || TO_CHAR(numbersAmount) || ', total sum: ' || TO_CHAR(totalSum));
END;

-- While loop
DECLARE
    totalSum INT := 0;
    numbersAmount INT := 0;
    i INT := 1;
BEGIN
    WHILE i <= 100 LOOP
        numbersAmount := numbersAmount + 1;
        totalSum := totalSum + i;
        i := i + 2;
    END LOOP;

    dbms_output.put_line('Numbers amount: ' || TO_CHAR(numbersAmount) || ', total sum: ' || TO_CHAR(totalSum));
END;

-- For loop
DECLARE
    totalSum INT := 0;
    numbersAmount INT := 0;
BEGIN
    FOR i IN 1..100 LOOP
        IF i MOD 2 = 1 THEN
            totalSum := totalSum + i;
            numbersAmount := numbersAmount + 1;
        END IF;
    END LOOP;
    
    dbms_output.put_line('Numbers amount: ' || TO_CHAR(numbersAmount) || ', total sum: ' || TO_CHAR(totalSum));
END;



-- 11. Ask for two numbers and print all the numbers in between

DECLARE
    x INT := &first;
    y INT := &second;
    aux INT;

BEGIN
    IF x > y THEN
        aux := y;
        y := x;
        x := aux;
    END IF;
    
    FOR i IN x..y LOOP
        dbms_output.put_line(i);
    END LOOP;
END;



-- 12. Ask for two numbers and print all the even numbers in between

DECLARE
    x INT := &first;
    y INT := &second;
    aux INT;
    
BEGIN
    IF x > y THEN
        aux := y;
        y := x;
        x := aux;
    END IF;
    
    FOR i IN x..y LOOP
        IF i MOD 2 = 0 THEN
            dbms_output.put_line(i);
        END IF;
    END LOOP;
END;



-- 13. Ask for two numbers and print all the odd numbers in between

DECLARE
    x INT := &first;
    y INT := &second;
    aux INT;
    
BEGIN
    IF x > y THEN
        aux := y;
        y := x;
        x := aux;
    END IF;

    FOR i IN x..y LOOP
        IF i MOD 2 = 1 THEN
            dbms_output.put_line(i);
        END IF;
    END LOOP;
END;



-- 15. Ask for a number and print the same amount of asterisks 

DECLARE
    x INT := &asterisks_amount;

BEGIN
    IF x < 0 THEN
        x := -x;
    END IF;
    
    FOR i IN 1..x LOOP
        dbms_output.put_line('*');
    END LOOP;
END;



-- 16. Compute the avarage of x numbers, which will stop being asked when a 0 is introduced

DECLARE
    x INT;
    i INT := 0;
    
    avarage INT;
    totalSum INT := 0;
BEGIN
    LOOP
        x := &number;
        totalSum := totalSum + x;
        
        IF x <> 0 THEN
            i := i + 1;
        END IF;
    EXIT WHEN x = 0;
    END LOOP;
    
    avarage := totalSum / i;
    dbms_output.put_line(avarage);
END;



-- 17. Compute the sum of the squares of the 100 first numbers

DECLARE
    totalSum INT := 0;

BEGIN
    FOR i IN 1..100 LOOP
        totalSum := totalSum + i ** 2;
    END LOOP;
    
    dbms_output.put_line(totalSum);
END;