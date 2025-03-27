# parcialback
Nombre: David Santiago Villadiego Medicis
Grupo: CVDS-2
Link Back: https://parcialt2back-ezf3hrb0bqeug0hx.mexicocentral-01.azurewebsites.net/
# Diagrama
![image](https://github.com/user-attachments/assets/78f5c59b-c15e-469b-8368-708fe61fdc6c)
#Clases principales
Para este parcial comenze con la creacion de los modelos continuado por sus repositorios servicioos y controladores
Tambien se hizo controlador y servicio para los productos
![image](https://github.com/user-attachments/assets/01b289e3-6c5e-448f-acbf-16d65a5c9379)
![image](https://github.com/user-attachments/assets/645bb0cc-08b6-4c60-9eac-7707de64f5ed)
![image](https://github.com/user-attachments/assets/7a15d454-0c08-4ea6-992a-c0d703cd6698)

Tras cada folder se realizo un commit
# Despliegue back
![image](https://github.com/user-attachments/assets/fd3ffb9b-bbdc-418c-8465-ee97ef0431e7)
Link azure: https://parcialt2back-ezf3hrb0bqeug0hx.mexicocentral-01.azurewebsites.net/
Link consulta de payments hechos: https://parcialt2back-ezf3hrb0bqeug0hx.mexicocentral-01.azurewebsites.net/payments?userId=user123
![image](https://github.com/user-attachments/assets/290ba9f4-21ed-4f4d-bc85-407fceed7f66)

# Post realizados a la base de datos:
http://localhost:8080/products
{
"name"; "Laptop",
"unitPrice": 1000.0
}

{
"name"; "Mouse",
"unitPrice": 1000.0
}

{
"name"; "Tv",
"unitPrice": 3000.0
}

http://localhost:8080/payments

{
"userId": "user123",
"date": "12-03-2025",
"items":[
{
"productName":"Laptop",
"unitPrice": 1000.0,
"quantity": 1
},
{
"productName":"Mouse",
"unitPrice": 50.0,
"quantity": 2
}
],
"totalAmount":1100.0
}

