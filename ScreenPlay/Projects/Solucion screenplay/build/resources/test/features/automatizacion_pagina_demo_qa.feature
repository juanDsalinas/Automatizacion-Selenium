#language: es

Característica: Implementación Automatizaciones sobre la página DemoQa
  Yo como usuario de la página
  Deseo interactuar con las diferentes características
  Para mejorar mis skills de automatizador


  Esquema del escenario: Escenario: Interactuar con el formulario
    Dado que 'Carlos' se encuentra en la pagina web 'https://demoqa.com/'
    Cuando seleccione la opcion de Forms con la categoria Practice Form con el registro de los datos
      | First Name      | <First Name>      |
      | Last Name       | <Last Name>       |
      | Email           | <Email>           |
      | Gender          | <Gender>          |
      | Mobile          | <Mobile>          |
      | Date of Birth   | <Date of Birth>   |
      | Subjects        | <Subjects>        |
      | Hobbies         | <Hobbies>         |
      | Current Address | <Current Address> |
      | State           | <State>           |
      | City            | <City>            |
    Entonces Puedo ver el mensaje de agradecimiento y mis datos en pantalla
      | First Name      | <First Name>      |
      | Email           | <Email>           |
      | Mobile          | <Mobile>          |
      | Date of Birth   | <Date of Birth>   |
      | Subjects        | <Subjects>        |
      | Current Address | <Current Address> |
      | State           | <State>           |
      | City            | <City>            |
      | Gracias         | <Gracias>         |



    Ejemplos:
      | First Name | Last Name | Email              | Gender | Mobile     | Date of Birth | Subjects  | Hobbies | Current Address | State         | City    | Gracias                        |
      | Gaia       | Zuluaga   | gaia@example.com   | Female | 1234567890 | 20 May 1998   | English   | Sports  | cra 123         | Uttar Pradesh | Lucknow | Thanks for submitting the form |
     # | Berlin     | Cruz      | berlin@example.com | Male   | 6543219878 | 15 Jul 2000   | Chemistry | Reading | cra 234         | Haryana       | Panipat | Thanks for submitting the form |
     # | Osiris     | Restrepo  | osiris@example.com | Other  | 7896543210 | 17 Jun 1963   | Biology   | Music   | cra 345         | Rajasthan     | Jaipur  | Thanks for submitting the form |

