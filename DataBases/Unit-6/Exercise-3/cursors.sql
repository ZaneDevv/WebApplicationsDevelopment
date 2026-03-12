-- Creating table

CREATE TABLE Client(
    dni VARCHAR2(9) PRIMARY KEY,
    name VARCHAR2(30),
    lastName VARCHAR2(30),
    birthDate DATE
);

DESCRIBE Client;

ALTER TABLE Client ADD city VARCHAR2(30);


-- Inserting data into the table

INSERT INTO Client VALUES('12345678A', 'John', 'Doe', TO_DATE('1970-12-15', 'YYYY-MM-DD'));
INSERT INTO Client VALUES('12345679A', 'Jane', 'Doe', TO_DATE('1970-12-15', 'YYYY-MM-DD'));
INSERT INTO Client VALUES('12345671A', 'Leonard', 'Cooper', TO_DATE('1970-12-15', 'YYYY-MM-DD'));

UPDATE Client SET city = 'Madrid';


SELECT * FROM Client;


-- Testing code (wildcards)

SET SERVEROUTPUT ON;
DECLARE
    -- The %type wildcard obtains the type of the given data:
    v_dni Client.dni%type;
    v_name Client.name%type;
    v_lastName Client.lastName%type;
    v_birthDate Client.birthDate%type;
    
    -- The %rowtype wildcard obtains a type which will correspond to a single whole line of the given table
    r_client Client%rowtype;
    
    v_rowsAmount INT := 0;
    
BEGIN
    -- It can only obtain a single value
    SELECT dni INTO v_dni FROM Client WHERE dni LIKE '%9_';
    SELECT name INTO v_name FROM Client WHERE dni LIKE '%9_';
    SELECT lastName INTO v_lastName FROM Client WHERE dni LIKE '%9_';
    SELECT birthDate INTO v_birthDate FROM CLient WHERE dni LIKE '%9_';
    
    
    SELECT * INTO r_client FROM Client WHERE dni LIKE '%8_';
    
    
    SeLECT COUNT(*) INTO v_rowsAmount FROM Client;
    
    
    dbms_output.put_line(v_dni);
    dbms_output.put_line('The name of the client is ' || v_name);
    dbms_output.put_line('The name of the client is ' || r_client.name);
    dbms_output.put_line('The table has ' || v_rowsAmount || ' rows');
END;


-- Testing code (cursors)

DECLARE
    -- A cursor is, essentially, the result of a query
    CURSOR c_client IS SELECT * FROM Client;
    
    r_client Client%rowtype;
    
BEGIN
    -- We must run the cursor (query)
    OPEN c_client;
    
    LOOP
        -- We save the result of the cursor (query) on the given variable(s)
        FETCH c_client INTO r_client;
        
        -- We must stop this loop when the cursor did not return anything
        EXIT WHEN c_client%NOTFOUND;
        
        dbms_output.put_line(r_client.dni);
        dbms_output.put_line(r_client.name);
        dbms_output.put_line(r_client.lastName);
        dbms_output.put_line(r_client.birthDate);
        dbms_output.put_line(r_client.city);
        dbms_output.put_line('-------------------------');
    END LOOP;
    
    -- Free the memory
    CLOSE c_client;
END;