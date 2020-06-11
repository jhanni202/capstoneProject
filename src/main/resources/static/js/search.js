function init(){

let fav1 = document.getElementById("fav1");
let fav2 = document.getElementById("fav2");
let fav3 = document.getElementById("fav3");





function getsource(id){
$.ajax({
url:"https://api.spoonacular.com/recipes/"+id+"/information?apiKey=db254b5cd61744d39a2deebd9c361444&number=3&query=",
success: function(res) {

}
});
}




function getrecepe(q){
$.ajax({
url:"https://api.spoonacular.com/recipes/search?apiKey=db254b5cd61744d39a2deebd9c361444&query="+q,
success: function(res) {

document.getElementById("output").innerHTML="<h1>"+res.results[0].title+"</h1><br><img src='"+res.baseUri+res.results[0].image+"' width='400' /><br>Ready in "+res.results[0].readyInMinutes+" minutes"
getsource(res.results[0].id)
document.getElementById("sourceLink1").innerHTML=res.results[0].title
document.getElementById("sourceLink1").href=res.results[0].sourceUrl

document.getElementById("output2").innerHTML="<h1>"+res.results[1].title+"</h1><br><img src='"+res.baseUri+res.results[1].image+"' width='400' /><br>Ready in "+res.results[1].readyInMinutes+" minutes"
getsource(res.results[1].id)
document.getElementById("sourceLink2").innerHTML=res.results[1].sourceUrl
document.getElementById("sourceLink2").href=res.results[1].sourceUrl

document.getElementById("output3").innerHTML="<h1>"+res.results[2].title+"</h1><br><img src='"+res.baseUri+res.results[2].image+"' width='400' /><br>Ready in "+res.results[2].readyInMinutes+" minutes"
getsource(res.results[2].id)
document.getElementById("sourceLink3").innerHTML=res.results[2].sourceUrl
document.getElementById("sourceLink3").href=res.results[2].sourceUrl
}
});
}


fav1.addEventListener("click",function(event){
    document.getElementById('favName').value = document.GetElementByID('sourceLink1).href";
    document.getElementById('favLink').value = document.GetElementByID('sourceLink1).innerHTML";
});

fav2.addEventListener("click",function(event){
    document.getElementById('favName').value = document.GetElementByID('sourceLink2).href";
    document.getElementById('favLink').value = document.GetElementByID('sourceLink2).innerHTML";
});

fav3.addEventListener("click",function(event){
    document.getElementById('favName').value = document.GetElementByID('sourceLink3).href";
    document.getElementById('favLink').value = document.GetElementByID('sourceLink3).innerHTML";
});




};

window.onload = init;

<form method="post" style="max-width:600px;">
    <div class="form-group">
        <label th:for="name">Fav Name</label>
        <input id = "favName" class="form-control" th:field="${fav.name}" />
        <span th:errors="${skill.name}" class="error"></span>
    </div>
    <div class="form-group">
        <label th:for="link">Fav Link</label>
        <input id = "favLink" class="form-control" th:field="${fav.link}" />
        <span th:errors="${skill.description}" class="error"></span>
    </div>
    <input type="submit" value="Add Fav" />
</form>


