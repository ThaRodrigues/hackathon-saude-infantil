# hackathon-saude-infantil
![](https://www.hackathonsaudeinfantil.com.br/wp-content/themes/desiderata/img/logo.png)

Hackathon Saude Infantil | Desiderata 
=======================

 [![Build Status](https://travis-ci.com/github/luanvsfeo.svg?branch=master)](https://travis-ci.com/github/luanvsfeo/hackathon-saude-infantil)


A boilerplate for **Node.js** web applications.

If you have attended any hackathons in the past, then you know how much time it takes to
get a project started: decide on what to build, pick a programming language, pick a web framework,
pick a CSS framework. A while later, you might have an initial project up on GitHub and only then
can other team members start contributing. Or how about doing something as simple as *Sign in with Facebook*
authentication? You can spend hours on it if you are not familiar with how OAuth 2.0 works.

When I started this project, my primary focus was on **simplicity** and **ease of use**.
I also tried to make it as **generic** and **reusable** as possible to cover most use cases of hackathon web apps,
without being too specific. In the worst case, you can use this as a learning guide for your projects,
if for example you are only interested in **Sign in with Google** authentication and nothing else.

Features
--------

- WhatsApp chatbot
- MVC Project Structure



Project Structure
-----------------

| Name                               | Description                                                  |
| ---------------------------------- | ------------------------------------------------------------ |
| **config**/passport.js             | Passport Local and OAuth strategies, plus login middleware.  |
| **controllers**/api.js             | Controller for /api route and all api examples.              |
| **controllers**/contact.js         | Controller for contact form.                                 |
| **controllers**/home.js            | Controller for home page (index).                            |
| **controllers**/user.js            | Controller for user account management.                      |
| **models**/User.js                 | Mongoose schema and model for User.                          |
| **public**/                        | Static assets (fonts, css, js, img).                         |
| **public**/**js**/application.js   | Specify client-side JavaScript dependencies.                 |
| **public**/**js**/main.js          | Place your client-side JavaScript here.                      |
| **public**/**css**/main.scss       | Main stylesheet for your app.                                |
| **public/css/themes**/default.scss | Some Bootstrap overrides to make it look prettier.           |
| **views/account**/                 | Templates for *login, password reset, signup, profile*.      |
| **views/api**/                     | Templates for API Examples.                                  |
| **views/partials**/flash.pug       | Error, info and success flash notifications.                 |
| **views/partials**/header.pug      | Navbar partial template.                                     |
| **views/partials**/footer.pug      | Footer partial template.                                     |
| **views**/layout.pug               | Base template.                                               |
| **views**/home.pug                 | Home page template.                                          |
| .dockerignore                      | Folder and files ignored by docker usage.                    |
| .env.example                       | Your API keys, tokens, passwords and database URI.           |
| .eslintrc                          | Rules for eslint linter.                                     |
| .gitignore                         | Folder and files ignored by git.                             |
| .travis.yml                        | Configuration files for continuous integration.              |
| app.js                             | The main application file.                                   |
| docker-compose.yml                 | Docker compose configuration file.                           |
| Dockerfile                         | Docker configuration file.                                   |
| package.json                       | NPM dependencies.                                            |
| package-lock.json                  | Contains exact versions of NPM dependencies in package.json. |


### Como o envio WhatsApp funciona neste projeto?
As intereções por WhatsApp permitem inserção e consulta de maneira comoda e oportuna.

Changelog
---------

Você pode encontrar o changelog do projeto aqui: [CHANGELOG.md](https://github.com/luanvsfeo/hackathon-saude-infantil/CHANGELOG.md)
