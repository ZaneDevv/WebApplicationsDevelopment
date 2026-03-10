-- First PL/SQL program

SET SERVEROUTPUT ON;


/*
Anonymous block
Three different parts:
    1. [OPTIONAL] Declaration (DECLARE)
    2. Program (BEGIN)
    3. [OPTIONAL] Exceptions management (EXCEPTION)
*/

-- 1. Hello, World!
DECLARE
    message VARCHAR2(255) := 'Hello, World!';
BEGIN
    dbms_output.put_line(message);
END;


-- 2. Variables
DECLARE
    message VARCHAR2(255) := '&set_text';
    height INT := 10;
BEGIN
    dbms_output.put_line(message);
    dbms_output.put_line(height);
END;


-- 3. Print date

DECLARE
    A VARCHAR(10) := '';
BEGIN
    SELECT TO_CHAR(SYSDATE) INTO A FROM DUAL;
    dbms_output.put_line('The current day is: ' || A);
EXCEPTION
    WHEN OTHERS THEN DBMS_OUTPUT.PUT_LINE('Hello!');
END;


-- 4. Declaring variables
-- We create variables in the DECLARE field

DECLARE
    PI CONSTANT REAL := 3.14159;
    TAU CONSTANT NUMBER(6, 5) := 6.28318;

    integers NUMBER(5, 3);
    height INT;
    birth_date DATE;
    name VARCHAR2(30) := 'John';
BEGIN
    height := 170;

    
    dbms_output.put_line(PI);
    dbms_output.put_line(TAU);

    dbms_output.put_line(integers);
    dbms_output.put_line(height);
    dbms_output.put_line(birth_date);
    dbms_output.put_line(name);
END;