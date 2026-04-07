/*
    Alumno: Álvaro Fernández Barrero
    Curso: 1º DAW BIL
    Fecha: 31/03/2026
*/

/* --------------------------------------------------
    ELIINACIÓN TABLAS
-------------------------------------------------- */

DROP TABLE CLIENTES;
DROP TABLE PEDIDOS;
DROP TABLE PRODUCTOS;
DROP TABLE DETALLE_PEDIDO;
DROP TABLE AUDITORIA;

/* --------------------------------------------------
    CREACIÓN DE TABLAS
-------------------------------------------------- */

CREATE TABLE CLIENTES(
    id_cliente INT,
    nombre VARCHAR2(25),
    ciudad VARCHAR2(10),
    saldo INT
);

CREATE TABLE PEDIDOS(
    id_pedido INT,
    id_cliente INT,
    fecha DATE,
    total INT
);

CREATE TABLE PRODUCTOS(
    id_producto INT,
    nombre VARCHAR2(25),
    precio INT,
    stock INT
);

CREATE TABLE DETALLE_PEDIDO(
    id_detalle INT,
    id_pedido INT,
    id_producto INT,
    cantidad INT
);

CREATE TABLE AUDITORIA (
    id_cliente NUMBER,
    fecha DATE,
    saldo_anterior NUMBER,
    saldo_nuevo NUMBER
);

/* --------------------------------------------------
    REVISIÓN DE TABLAS
-------------------------------------------------- */

DESCRIBE CLIENTES;
DESCRIBE PEDIDOS;
DESCRIBE PRODUCTOS;
DESCRIBE DETALLE_PEDIDO;
DESCRIBE AUDITORIA;

/* --------------------------------------------------
    CARGA DE DATOS
-------------------------------------------------- */

INSERT INTO CLIENTES VALUES (1, 'Ana López', 'Sevilla', 1200);
INSERT INTO CLIENTES VALUES (2, 'Juan Pérez', 'Madrid', 500);
INSERT INTO CLIENTES VALUES (3, 'María García', 'Valencia', 2000);
INSERT INTO CLIENTES VALUES (4, 'Carlos Ruiz', 'Sevilla', 300);
INSERT INTO CLIENTES VALUES (5, 'Lucía Fernández', 'Bilbao', 800);

INSERT INTO PRODUCTOS VALUES (1, 'Portátil', 800, 10);
INSERT INTO PRODUCTOS VALUES (2, 'Ratón', 20, 50);
INSERT INTO PRODUCTOS VALUES (3, 'Teclado', 50, 30);
INSERT INTO PRODUCTOS VALUES (4, 'Monitor', 200, 15);
INSERT INTO PRODUCTOS VALUES (5, 'Impresora', 150, 8);

INSERT INTO PEDIDOS VALUES (1, 1, SYSDATE, 0);
INSERT INTO PEDIDOS VALUES (2, 2, SYSDATE, 0);
INSERT INTO PEDIDOS VALUES (3, 3, SYSDATE, 0);
INSERT INTO PEDIDOS VALUES (4, 1, SYSDATE, 0);
INSERT INTO PEDIDOS VALUES (5, 4, SYSDATE, 0);

INSERT INTO DETALLE_PEDIDO VALUES (1, 1, 1, 1); -- portátil
INSERT INTO DETALLE_PEDIDO VALUES (2, 1, 2, 2); -- ratones
INSERT INTO DETALLE_PEDIDO VALUES (3, 2, 3, 1); -- teclado
INSERT INTO DETALLE_PEDIDO VALUES (4, 2, 4, 1); -- monitor
INSERT INTO DETALLE_PEDIDO VALUES (5, 3, 5, 1); -- impresora

INSERT INTO AUDITORIA VALUES (1, SYSDATE, 1000, 1200);
INSERT INTO AUDITORIA VALUES (2, SYSDATE, 600, 500);
INSERT INTO AUDITORIA VALUES (3, SYSDATE, 1800, 2000);
INSERT INTO AUDITORIA VALUES (4, SYSDATE, 400, 300);
INSERT INTO AUDITORIA VALUES (5, SYSDATE, 700, 800);

/* --------------------------------------------------
    REVISIÓN DE DATOS
-------------------------------------------------- */

SELECT * FROM CLIENTES;
SELECT * FROM PEDIDOS;
SELECT * FROM PRODUCTOS;
SELECT * FROM DETALLE_PEDIDO;
SELECT * FROM AUDITORIA;

/* --------------------------------------------------
    EJERCICIOS
-------------------------------------------------- */

/* Ejercicio 1: Función saldo cliente
    Se desea implementar una función que reciba el identificador de un cliente y devuelva su saldo actual. Si el cliente no existe, deberá devolver NULL.
*/

CREATE OR REPLACE FUNCTION obtenerSalarioPorIdCliente(clienteId CLIENTES.id_cliente%TYPE) RETURN CLIENTES.saldo%TYPE IS
    saldoCliente CLIENTES.saldo%TYPE := 0;
    
BEGIN
    SELECT saldo
    INTO saldoCliente
    FROM CLIENTES
    WHERE id_cliente = clienteId;
    
    RETURN saldoCliente;
    
EXCEPTION
    WHEN NO_DATA_FOUND THEN RETURN NULL;
END obtenerSalarioPorIdCliente;


DECLARE
    idCliente CLIENTES.id_cliente%TYPE := '&CLIENTE_ID';
    saldo CLIENTES.saldo%TYPE := 0;

BEGIN
    saldo := obtenerSalarioPorIdCliente(idCliente);
    
    dbms_output.put_line('----------------------------------');
    dbms_output.put_line('Ejercicio 1: Función saldo cliente:');
    dbms_output.put_line('El saldo del cliente con id ' || idCliente || ' es de ' || saldo || '€');
    dbms_output.put_line('----------------------------------');
END;



/* Ejercicio 2: Procedimiento actualizar saldo
    Crear un procedimiento que permita actualizar el saldo de un cliente sumando o restando una cantidad.
*/

CREATE OR REPLACE PROCEDURE actualizarSaldo(clienteId CLIENTES.id_cliente%TYPE, cantidad INT) IS
BEGIN
    UPDATE CLIENTES
    SET saldo = saldo + cantidad
    WHERE id_cliente = clienteId;
END actualizarSaldo;


DECLARE
    clienteId CLIENTES.id_cliente%TYPE := '&CLIENTE_ID';
    cantidad INT := '&CANTIDAD_A_AGREGAR';
    
    saldoAnterior INT := 0;
    saldoActualizado INT := 0;
    
BEGIN
    SELECT saldo
    INTO saldoAnterior
    FROM CLIENTES
    WHERE id_cliente = clienteId;
    
    actualizarSaldo(clienteId, cantidad);
    
    SELECT saldo
    INTO saldoActualizado
    FROM CLIENTES
    WHERE id_cliente = clienteId;
    
    dbms_output.put_line('----------------------------------');
    dbms_output.put_line('Ejercicio 2: Procedimiento actualizar saldo:');
    dbms_output.put_line('Saldo del cliente con id ' || clienteId || ':');
    dbms_output.put_line('- saldo anterior: ' || saldoAnterior || '€');
    dbms_output.put_line('- saldo actual: ' || saldoActualizado || '€');
    dbms_output.put_line('----------------------------------');
END;



/* Ejercicio 3: Función contar pedidos
    Crear una función que devuelva el número total de pedidos realizados por un cliente.
*/

CREATE OR REPLACE FUNCTION contarPedidos(clienteId CLIENTES.id_cliente%TYPE) RETURN INT IS
    pedidosTotal INT;
    
BEGIN
    SELECT COUNT(*)
    INTO pedidosTotal
    FROM PEDIDOS
    WHERE id_cliente = clienteId;
    
    RETURN pedidosTotal;
    
EXCEPTION
    WHEN NO_DATA_FOUND THEN RETURN NULL;
END contarPedidos;


DECLARE
    clienteId CLIENTES.id_cliente%TYPE := '&CLIENTE_ID';
    
BEGIN
    dbms_output.put_line('----------------------------------');
    dbms_output.put_line('Ejercicio 3: Función contar pedidos:');
    dbms_output.put_line('El cliente con id ' || clienteId || ' ha realizado ' || contarPedidos(clienteId) || ' pedidos.');
    dbms_output.put_line('----------------------------------');
END;



/* Ejercicio 4: Insertar pedido
    Crear un procedimiento que inserte un nuevo pedido con fecha actual y total inicial 0.
*/

CREATE OR REPLACE PROCEDURE agregarPedido(clienteId CLIENTES.id_cliente%TYPE) IS
    pedidoId PEDIDOS.id_pedido%TYPE := 0;
    
BEGIN
    SELECT MAX(id_pedido)
    INTO pedidoId
    FROM PEDIDOS;
    
    pedidoId := pedidoId + 1;
    
    
    INSERT INTO PEDIDOS VALUES (pedidoId, clienteId, SYSDATE, 0);
END agregarPedido;


DECLARE
    clienteId CLIENTES.id_cliente%TYPE := '&CLIENTE_ID';
    
BEGIN
    agregarPedido(clienteId);

    dbms_output.put_line('----------------------------------');
    dbms_output.put_line('Ejercicio 4: Insertar pedido:');
    dbms_output.put_line('Se ha creado un nuevo pedido al nombre del cliente con id ' || clienteId || '.');
    dbms_output.put_line('----------------------------------');
END;



/* Ejercicio 5: Total gastado
    Crear una función que calcule el total gastado por un cliente sumando todos sus pedidos.
*/

CREATE OR REPLACE FUNCTION calcularTotalGastado(idCliente CLIENTES.id_cliente%TYPE) RETURN INT IS
    totalGastado INT := 0;
    
BEGIN
    SELECT SUM(PRODUCTOS.precio * DETALLE_PEDIDO.cantidad)
    INTO totalGastado
    FROM PEDIDOS
    JOIN DETALLE_PEDIDO ON DETALLE_PEDIDO.id_pedido = PEDIDOS.id_pedido
    JOIN PRODUCTOS ON PRODUCTOS.id_producto = DETALLE_PEDIDO.id_producto
    WHERE PEDIDOS.id_cliente = idCliente;

    RETURN totalGastado;
END calcularTotalGastado;


DECLARE
    clienteId CLIENTES.id_cliente%TYPE := '&CLIENTE_ID';
    
BEGIN
    dbms_output.put_line('----------------------------------');
    dbms_output.put_line('Ejercicio 5: Total gastado:');
    dbms_output.put_line('El cliente de id ' || clienteId || ' ha gastado ' || calcularTotalGastado(clienteId) || '€');
    dbms_output.put_line('----------------------------------');
END;



/* Ejercicio 6: Actualizar stock
    Crear un procedimiento que reduzca el stock de un producto. Si no hay suficiente stock, debe mostrar un error.
*/

CREATE OR REPLACE FUNCTION obtenerStockDeProducto(productoId PRODUCTOS.id_producto%TYPE) RETURN PRODUCTOS.stock%TYPE IS
    stockProducto PRODUCTOS.stock%TYPE := 0;
    
BEGIN
    SELECT stock
    INTO stockProducto
    FROM PRODUCTOS
    WHERE id_producto = productoId;
    
    RETURN stockProducto;
END obtenerStockDeProducto;


CREATE OR REPLACE PROCEDURE reducirStock(productoId PRODUCTOS.id_producto%TYPE, cantidad PRODUCTOS.stock%TYPE) IS
    stockProducto PRODUCTOS.stock%TYPE := obtenerStockDeProducto(productoId);
    
BEGIN
    IF (stockProducto >= cantidad) THEN
        UPDATE PRODUCTOS
        SET stock = stock - cantidad
        WHERE id_producto = productoId;
    ELSE
        RAISE_APPLICATION_ERROR(-20002, '¡No hay suficiente stock!');
    END IF;
END reducirStock;


DECLARE
    idProducto PRODUCTOS.id_producto%TYPE := '&PRODUCTO_ID';
    cantidad PRODUCTOS.stock%TYPE := '&CANTIDAD';
    
    stock PRODUCTOS.stock%TYPE := obtenerStockDeProducto(idProducto);
        
BEGIN
    dbms_output.put_line('----------------------------------');
    dbms_output.put_line('Ejercicio 6: Actualizar stock:');
    dbms_output.put_line('Stock actual del producto con id ' || idProducto || ' es de ' || stock);
    
    reducirStock(idProducto, cantidad);
    stock := obtenerStockDeProducto(idProducto);
    
    dbms_output.put_line('Nuevo stock del producto con id ' || idProducto || ' es de ' || stock);
    dbms_output.put_line('----------------------------------');

EXCEPTION
    WHEN OTHERS THEN
        dbms_output.put_line('¡Este producto no tiene suficiente stock!');
        dbms_output.put_line('----------------------------------');
END;



/* Ejercicio 7: Comprobar disponibilidad
    Crear una función que devuelva TRUE si hay suficiente stock de un producto.
*/

CREATE OR REPLACE FUNCTION revisarStockSuficiente(productoId PRODUCTOS.id_producto%TYPE) RETURN BOOLEAN IS
    stockProducto PRODUCTOS.stock%TYPE := obtenerStockDeProducto(productoId);
    
BEGIN
    RETURN stockProducto > 0;
END revisarStockSuficiente;


DECLARE
    idProducto PRODUCTOS.id_producto%TYPE := '&PRODUCTO_ID';
    
BEGIN
    dbms_output.put_line('----------------------------------');
    dbms_output.put_line('Ejercicio 7: Comprobar disponibilidad:');
    
    IF (revisarStockSuficiente(idProducto)) THEN
        dbms_output.put_line('El producto de id ' || idProducto || ' tiene suficiente stock');
    ELSE
        dbms_output.put_line('El producto de id ' || idProducto || ' NO tiene suficiente stock');
    END IF;
    
    dbms_output.put_line('----------------------------------');
END;



/* Ejercicio 8: Registrar detalle pedido
    Crear un procedimiento que:
    • Inserte un detalle de pedido  
    • Actualice el stock del producto  
*/

CREATE OR REPLACE PROCEDURE agregarDetallePedido(idPedido PEDIDOS.id_pedido%TYPE, idProducto PRODUCTOS.id_producto%TYPE) IS
    idDetallePedido DETALLE_PEDIDO.id_detalle%TYPE := 0;
    
BEGIN
    SELECT MAX(id_detalle)
    INTO idDetallePedido
    FROM DETALLE_PEDIDO;
    
    idDetallePedido := idDetallePedido + 1;

    INSERT INTO DETALLE_PEDIDO VALUES(idDetallePedido, idPedido, idProducto, 1);
    
    UPDATE PRODUCTOS
    SET stock = stock - 1
    WHERE id_producto = idProducto;
END agregarDetallePedido;


DECLARE
    idPedido PEDIDOS.id_pedido%TYPE := '&PEDIDO_ID';
    idProducto PRODUCTOS.id_producto%TYPE := '&PRODUCTO_ID';
    
    stock PRODUCTOS.stock%TYPE := obtenerStockDeProducto(idProducto);

BEGIN
    dbms_output.put_line('----------------------------------');
    dbms_output.put_line('Ejercicio 8: Registrar detalle pedido:');
    dbms_output.put_line('El stock actual del producto con id ' || idProducto || ' es de ' || stock);
    
    agregarDetallePedido(idPedido, idProducto);
    stock := obtenerStockDeProducto(idProducto);
    
    dbms_output.put_line('Tras agregar el detalle del pedido, el stock del producto es de ' || stock);
    dbms_output.put_line('----------------------------------');
END;


/* Ejercicio 9: Total de pedido
    Crear una función que calcule el total de un pedido sumando cantidad × precio.
*/

CREATE OR REPLACE FUNCTION calcularTotalPedido(pedido PEDIDOS.id_pedido%TYPE) RETURN INT IS
    precioTotal PRODUCTOS.precio%TYPE := 0;
    
BEGIN
    SELECT SUM(PRODUCTOS.precio * DETALLE_PEDIDO.cantidad)
    INTO precioTotal
    FROM PEDIDOS
    JOIN DETALLE_PEDIDO ON DETALLE_PEDIDO.id_pedido = PEDIDOS.id_pedido
    JOIN PRODUCTOS ON PRODUCTOS.id_producto = DETALLE_PEDIDO.id_producto
    WHERE PEDIDOS.id_pedido = pedido;
    
    RETURN precioTotal;
END calcularTotalPedido;


DECLARE
    idPedido PEDIDOS.id_pedido%TYPE := '&PEDIDO_ID';
   
BEGIN
    dbms_output.put_line('----------------------------------');
    dbms_output.put_line('Ejercicio 9: Total de pedido:');
    dbms_output.put_line('El precio total del pedido de id ' || idPedido || ' es de ' || calcularTotalPedido(idPedido) || '€');
    dbms_output.put_line('----------------------------------');
END;



/* Ejercicio 10: Procedimiento completo
    Crear un procedimiento que:
    • Inserte pedido  
    • Inserte detalles  
    • Verifique stock  
    • Actualice stock  
    • Calcule total  
    • Use control de errores con rollback
*/

CREATE OR REPLACE PROCEDURE registrarPedido(idProducto PRODUCTOS.id_producto%TYPE, idCliente CLIENTES.id_cliente%TYPE, cantidad DETALLE_PEDIDO.cantidad%TYPE) IS
    stockProducto PRODUCTOS.stock%TYPE := 0;
    precioProducto PRODUCTOS.precio%TYPE := 0;
    
    idPedido PEDIDOS.id_pedido%TYPE := 0;
    idDetallePedido DETALLE_PEDIDO.id_detalle%TYPE := 0;
    
    total INT := 0;
    
    SIN_STOCK EXCEPTION;
    
BEGIN
    -- Obtención del stock actual del producto
    SELECT stock
    INTO stockProducto
    FROM PRODUCTOS
    WHERE id_producto = idProducto;
    
    -- Si está el producto fuera de stock, lanza una excepción
    IF (stockProducto < cantidad) THEN
        RAISE SIN_STOCK;
    ELSE
        -- Actualización del stock
        UPDATE PRODUCTOS
        SET stock = stock - cantidad
        WHERE id_producto = idProducto;
        
        -- Obtención del precio del producto
        SELECT precio
        INTO precioProducto
        FROM PRODUCTOS
        WHERE id_producto = idProducto;
        
        -- Calculando el precio total del pedido según el precio del producto y cuántos se requieren
        total := precioProducto * cantidad;
        
        
        -- Cálculo del siguiende ID para el pedido
        SELECT MAX(id_pedido)
        INTO idPedido
        FROM PEDIDOS;
        
        idPedido := idPedido + 1;
        
        
        -- Cálculo del siguiente ID de los detalles de pedido
        SELECT MAX(id_detalle)
        INTO idDetallePedido
        FROM DETALLE_PEDIDO;
        
        idDetallePedido := idDetallePedido + 1;
        
        
        -- Agregando un nuevo pedido con sus detalles en sus tablas correspondientes
        INSERT INTO PEDIDOS VALUES(idPedido, idCliente, SYSDATE, total);
        INSERT INTO DETALLE_PEDIDO VALUES(idDetallePedido, idPedido, idProducto, cantidad);
    END IF;

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        dbms_output.put_line('Error: el registro ha sido cancelada');
END;


DECLARE
    idProducto PRODUCTOS.id_producto%TYPE := '&ID_PRODUCTO';
    idCliente CLIENTES.id_cliente%TYPE := '&ID_CLIENTE';
    cantidad DETALLE_PEDIDO.cantidad%TYPE := '&CANTIDAD';
    
BEGIN
    registrarPedido(idProducto, idCliente, cantidad);
    
    dbms_output.put_line('----------------------------------');
    dbms_output.put_line('Ejercicio 10: Procedimiento completo:');
    dbms_output.put_line('El cliente ' || idCliente || ' ha comprado ' || cantidad || ' productos de id ' || idProducto || ' correctamente');
    dbms_output.put_line('----------------------------------');
END;



/* Ejercicio 11: Control de crédito de cliente
    Crear un procedimiento que:
    • Reciba un id_cliente y un importe de compra
    • Verifique si el cliente tiene saldo suficiente
    • Si tiene:
        - Reste el saldo
        - Permita la operación
    • Si no tiene:
        - Lance un error personalizado
*/

CREATE OR REPLACE PROCEDURE verificarSaldoDelCliente(idCliente CLIENTES.id_cliente%TYPE, precioTotal PRODUCTOS.precio%TYPE) IS
    saldoCliente CLIENTES.saldo%TYPE := 0;

BEGIN
    SELECT saldo
    INTO saldoCliente
    FROM CLIENTES
    WHERE id_cliente = idCliente;
    
    
    IF (saldoCliente >= precioTotal) THEN
        UPDATE CLIENTES
        SET saldo = saldoCliente - precioTotal
        WHERE id_cliente = idCliente;
    ELSE
        RAISE_APPLICATION_ERROR(-20001, 'El cliente de id ' || idCliente || ' no cuenta con suficiente saldo. Saldo esperado: >= ' || precioTotal || '€');
    END IF;
END verificarSaldoDelCliente;


DECLARE
    idCliente CLIENTES.id_cliente%TYPE := '&ID_CLIENTE';
    precioTotal PRODUCTOS.precio%TYPE := '&PRECIO_PRODUCTO';
    
BEGIN
    dbms_output.put_line('----------------------------------');
    dbms_output.put_line('Ejercicio 11: Control de crédito de cliente:');
    
    verificarSaldoDelCliente(idCliente, precioTotal);
    
    dbms_output.put_line('El cliente ' || idCliente || ' tiene el saldo suficiente');
    dbms_output.put_line('----------------------------------');
    
EXCEPTION
    WHEN OTHERS THEN
        dbms_output.put_line('El cliente ' || idCliente || ' no tiene el saldo suficiente');
        dbms_output.put_line('----------------------------------');
END;


/* Ejercicio 12: Aplicar descuentos progresivos
    Crear una función que calcule el precio final de un pedido según reglas:
    • 100€ → 10% descuento
    • 500€ → 20% descuento
    • Cliente VIP (saldo > 1000) → +5% extra
*/

CREATE OR REPLACE FUNCTION calcularPrecioFinal(pedidoId PEDIDOS.id_pedido%TYPE) RETURN PRODUCTOS.precio%TYPE IS
    precioTotal PRODUCTOS.precio%TYPE := 0;
    cantidadProducto DETALLE_PEDIDO.cantidad%TYPE := 0;
    saldoCliente CLIENTES.saldo%TYPE := 0;
    
    descuento DECIMAL := 0;
        
BEGIN
    -- Obteniendo parámetros
    
    SELECT SUM(PRODUCTOS.precio * DETALLE_PEDIDO.cantidad)
    INTO precioTotal
    FROM PEDIDOS
    JOIN DETALLE_PEDIDO ON DETALLE_PEDIDO.id_pedido = PEDIDOS.id_pedido
    JOIN PRODUCTOS ON PRODUCTOS.id_producto = DETALLE_PEDIDO.id_producto
    WHERE PEDIDOS.id_pedido = pedidoId;
    
    SELECT CLIENTES.saldo
    INTO saldoCliente
    FROM PEDIDOS
    JOIN CLIENTES ON CLIENTES.id_cliente = PEDIDOS.id_cliente
    WHERE PEDIDOS.id_pedido = pedidoId;
    
    
    -- Cálculo del descuento
    
    IF (precioTotal >= 500) THEN
        descuento := 0.2;
    ELSIF (precioTotal >= 100) THEN
        descuento := 0.1;
    END IF;
    
    IF (saldoCliente > 1e3) THEN
        descuento := descuento + 0.05;
    END IF;
    
    
    RETURN precioTotal * (1 - descuento);
END calcularPrecioFinal;


DECLARE
    idPedido PEDIDOS.id_pedido%TYPE := '&ID_PEDIDO';

BEGIN
    dbms_output.put_line('----------------------------------');
    dbms_output.put_line('Ejercicio 12: Aplicar descuentos progresivos:');
    dbms_output.put_line('El pedido de id ' || idPedido || ', tras aplicar los descuentos, tiene un precio total de ' || calcularPrecioFinal(idPedido) || '€');
    dbms_output.put_line('----------------------------------');
END;



/* Ejercicio 13: Procesar pedidos en lote (uso de cursor)
    Crear un procedimiento que:
    • Recorra todos los pedidos sin total (total = 0)
    • Calcule su total
    • Actualice la tabla
    • Muestre por pantalla cada actualización
*/

CREATE OR REPLACE PROCEDURE actualizarTotales IS
    CURSOR pedidosSinTotal IS
    SELECT *
    FROM PEDIDOS
    WHERE total = 0;
    
    totalPedido PEDIDOS.total%TYPE := 0;
    
BEGIN
    FOR filaPedido IN pedidosSiNTotal LOOP
        SELECT SUM(PRODUCTOS.precio * DETALLE_PEDIDO.cantidad)
        INTO totalPedido
        FROM PEDIDOS
        JOIN DETALLE_PEDIDO ON DETALLE_PEDIDO.id_pedido = PEDIDOS.id_pedido
        JOIN PRODUCTOS ON PRODUCTOS.id_producto = DETALLE_PEDIDO.id_producto
        WHERE PEDIDOS.id_pedido = filaPedido.id_pedido;
        
        UPDATE PEDIDOS
        SET total = totalPedido
        WHERE id_pedido = filaPedido.id_pedido;
        
        dbms_output.put_line('El pedido de id ' || filaPedido.id_pedido || ' ha sido actualizado. Tiene un total de ' || totalPedido || '€');
    END LOOP;
END actualizarTotales;


BEGIN
    dbms_output.put_line('----------------------------------');
    dbms_output.put_line('Ejercicio 13: Procesar pedidos en lote (uso de cursor):');
    
    actualizarTotales();
    
    dbms_output.put_line('----------------------------------');
END;



/* Ejercicio 14: Registro de auditoría
    Crear un procedimiento que:
    • Actualice el saldo de un cliente
    • Guarde un registro en una tabla AUDITORIA con:
        - id_cliente
        - fecha
        - saldo anterior
        - saldo nuevo
*/

CREATE OR REPLACE PROCEDURE actualizarSaldo(idCliente CLIENTES.id_cliente%TYPE, nuevoSaldo CLIENTES.saldo%TYPE) IS
    saldoAnterior CLIENTES.saldo%TYPE := 0;
    
BEGIN
    SELECT saldo
    INTO saldoAnterior
    FROM CLIENTES
    WHERE id_cliente = idCliente;
    
    
    UPDATE CLIENTES
    SET saldo = nuevoSaldo
    WHERE id_cliente = idCliente;
    
    
    INSERT INTO AUDITORIA VALUES(idCliente, SYSDATE, saldoAnterior, nuevoSaldo);
END actualizarSaldo;


DECLARE
    idCliente CLIENTES.id_cliente%TYPE := '&ID_CLIENTE';
    nuevoSaldo CLIENTES.saldo%TYPE := '&NUEVO_SALDO';

BEGIN
    actualizarSaldo(idCliente, nuevoSaldo);
    
    dbms_output.put_line('----------------------------------');
    dbms_output.put_line('Ejercicio 14: Registro de auditoría:');
    dbms_output.put_line('El cliente de id ' || idCliente || ' ahora cuenta con un saldo de ' || nuevoSaldo || '€');
    dbms_output.put_line('----------------------------------');
END;