-- For loop

BEGIN
    FOR i IN 1..10 LOOP -- Starts at 1 and ends at 10
        dbms_output.put_line('Number: ' || TO_CHAR(i) || ' square: ' || TO_CHAR(i ** 2));
    END LOOP;
END;


BEGIN
    FOR i IN REVERSE 1..10 LOOP -- Starts at 10 and ends at 1
        dbms_output.put_line('Number: ' || TO_CHAR(i) || ' square: ' || TO_CHAR(i ** 2));
    END LOOP;
END;
