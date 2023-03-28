function changeLang(){
    let intable = document.getElementById("lang").value;
    let idtable = document.getElementById("table");
  
    let firrow = idtable.rows[0];
    let secrow = idtable.rows[1];
  
    switch(intable){
      case "日本語":
        firrow.style.display = "block";
        secrow.style.display = "none";
        break; 
      case "English":
        secrow.style.display = "block";
        firrow.style.display = "none";
        break;
      case "全て表示":
        firrow.style.display = "block";
        secrow.style.display = "block";
        break;
    }
  }
