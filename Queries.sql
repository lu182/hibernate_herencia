use bdherenciahibernate;
SELECT * FROM bdherenciahibernate.producto;
SELECT * FROM bdherenciahibernate.categoriaproducto;

/* HERENCIA 1 - SINGLE_TABLE: */ 
SELECT * FROM bdherenciahibernate.persona1;

/* HERENCIA 2 - TABLE_PER_CLASS: */ 
SELECT * FROM bdherenciahibernate.cliente2;
SELECT * FROM bdherenciahibernate.empleado2;

/* HERENCIA 3 - JOINED: */ 
SELECT * FROM bdherenciahibernate.persona3;
SELECT * FROM bdherenciahibernate.cliente3;
SELECT * FROM bdherenciahibernate.empleado3;











