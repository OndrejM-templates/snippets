function process(jsonText)
var json = JSON.parse(jsonText);
      for (var i = 0; i< json.length; i++) {
        var o = json[i];
        var found = false;
        if (o.name.toLowerCase().indexOf('repo') >= 0) {
         console.log(o.name);
          found = true;
        }
        if (!found) {
          console.log("Not found");
        }
      }


setTimeout(function() {
var xhr = new XMLHttpRequest();

xhr.onreadystatechange=function()  {
  if (xhr.readyState==4 && xhr.status==200)
    {
    }
};
xhr.open("GET","https://api.github.com/hooks",true);
xhr.send();
}, 1000);
