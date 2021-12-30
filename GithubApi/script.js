var form = document.getElementById("myForm")

form.addEventListener('submit', function(e){
  e.preventDefault()
  var search = document.getElementById("search").value

  fetch("https://api.github.com/users/" +search)
  .then((result) => result.json())
  .then((data) => {
    console.log(data)
    document.getElementById("result").innerHTML = `
    <br>
    <h2 style="font-size:20px; color:white; font-family:helvetica; position:absolute; left:130px; top:310px;"> Avatar: </h2>
    <img src="${data.avatar_url}" style="width:15%; position:absolute; left:300px;"/>
    <br>
    <h3 style="font-size:20px; color:white; font-family:helvetica; position:absolute; left:130px; top:450px;"> Name: </h3>
    <p style="font-size:20px; color:white; font-family:arial; position:absolute; left:300px; top:450px"> ${data.name} </p>
    <br><br>
    <h4 style="font-size:20px; color:white; font-family:helvetica; position:absolute; left:130px; top:500px;"> Date Created: </h4>
    <p style="font-size:20px; color:white; font-family:arial; position:absolute; left:300px; top:500px"> ${data.created_at}</p>
    <br>
    <h5 style="font-size:20px; color:white; font-family:helvetica; position:absolute; left:130px; top:550px;"> Number of repos: </h5>
    <p style="font-size:20px; color:white; font-family:arial; position:absolute; left:300px; top:550px"> ${data.public_repos}</p>
    <br>
    <h6 style="font-size:20px; color:white; font-family:helvetica; position:absolute; left:130px; top:600px;"> Bio: </h6>
    <p style="font-size:20px; color:white; font-family:arial; position:absolute; left:300px; top:600px"> ${data.bio}</p>
    <br>
    <h7 style="font-size:20px; color:white; font-family:helvetica; position:absolute; left:130px; top:650px;"> Link to Github: </h7>
    <a target="_blank" href ="https://www.github.com/${search}">
    <p style="font-size:20px; color:white; font-family:arial; position:absolute; left:300px; top:650px">  ${data.repos_url}</p>
    </a>
    `
  })
})
