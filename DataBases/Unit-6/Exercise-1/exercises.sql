/* 
1. Make an anonymous block in PL/SQL that declares two variables INT with a certain value.
   Declare another variable INT result.
   Add the two previous variables and print it
*/

DECLARE
    x INT := &Number_x;
    y INT := &Number_y;
    
    result INT;
BEGIN
    result := x + y;
    dbms_output.put_line(x || ' + ' || y || ' = ' || result);
END;


/*
2. Compare the two introduced number and say which one is the greatest
*/

DECLARE
    x INT := &Number_x;
    y INT := &Number_y;
BEGIN
    IF x < y THEN
        dbms_output.put_line('The greatest is ' || y);
    ELSIF x > y THEN
        dbms_output.put_line('The greatest is ' || x);
    ELSE
        dbms_output.put_line('Both numbers are the same');
    END IF;
END;


/*
3. Ask for a ID with no letter and return te corresponding letter to it
*/

DECLARE
    dni INT := &dni;
BEGIN
    CASE dni MOD 23
        WHEN 0  THEN dbms_output.put_line('T');
        WHEN 1  THEN dbms_output.put_line('R');
        WHEN 2  THEN dbms_output.put_line('W');
        WHEN 3  THEN dbms_output.put_line('A');
        WHEN 4  THEN dbms_output.put_line('G');
        WHEN 5  THEN dbms_output.put_line('M');
        WHEN 6  THEN dbms_output.put_line('Y');
        WHEN 7  THEN dbms_output.put_line('F');
        WHEN 8  THEN dbms_output.put_line('P');
        WHEN 9  THEN dbms_output.put_line('D');
        WHEN 10 THEN dbms_output.put_line('X');
        WHEN 11 THEN dbms_output.put_line('B');
        WHEN 12 THEN dbms_output.put_line('N');
        WHEN 13 THEN dbms_output.put_line('J');
        WHEN 14 THEN dbms_output.put_line('Z');
        WHEN 15 THEN dbms_output.put_line('S');
        WHEN 16 THEN dbms_output.put_line('Q');
        WHEN 17 THEN dbms_output.put_line('V');
        WHEN 18 THEN dbms_output.put_line('H');
        WHEN 19 THEN dbms_output.put_line('L');
        WHEN 20 THEN dbms_output.put_line('C');
        WHEN 21 THEN dbms_output.put_line('K');
        WHEN 22 THEN dbms_output.put_line('E');
        ELSE dbms_output.put_line('Invalid number!');
    END CASE;
END;


/*
4. Make a loop that counts from 1 to 5
*/

DECLARE
    i INT := 1;
BEGIN
    LOOP
        dbms_output.put_line(i);
        i := i + 1;
    EXIT WHEN i = 6;
    END LOOP;
END;