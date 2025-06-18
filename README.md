Návod na spustenie aplikácie 

- Clone the repository from main branche

- Swithc to Database Branche and download the db folder 

- insert the folder to wampserver databases which are most likely located here C:\wamp64\bin\mysql\mysql9.1.0\data

- connect the db from IntelliJ

- start postman with basic auth with the username: user and Password: (generated UUID from console saying Using generated security password: xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx)

- test methodes like 

-   GET http://localhost:8080/notes
or  GET http://localhost:8080/users to show all the users with different notes 

- POST http://localhost:8080/notes (and insert json to create a note like this): 

  {
  "title": "Hello Note",
  "content": "Good Morning",
  "user": { "id": 1 } 
}

- POST http://localhost:8080/users (to create a new user and then you can try to assign the user a note with his id)

{
  "username": "Johnny",
  "password": "1212"
}

- PATCH http://localhost:8080/notes/id (Update the note)

{
  "title": "Updated First Note Title"
}

you can use these to test the app and other you can find in code 




