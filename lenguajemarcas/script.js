let contenedor = document.getElementById("tarjetas");
let buscador = document.getElementById("buscador");
let btnBuscar = document.getElementById("buscar");

window.addEventListener("load", function(){
    let xhr = new XMLHttpRequest();
    xhr.open("GET", "gimnasio.xml", true);

    xhr.onload = function(){
        if(xhr.status === 200){
            let xml = xhr.responseXML;
            let clientes = xml.getElementsByTagName("cliente");

            for(let i=0; i<clientes.length; i++){

                let nombre = clientes[i].getElementsByTagName("nombre")[0].textContent;
                let telefono = clientes[i].getElementsByTagName("telefono")[0].textContent;

                let div = document.createElement("div");
                div.className = "tarjeta";
                div.innerHTML = "<h3>"+nombre+"</h3><p>"+telefono+"</p>";

                contenedor.appendChild(div);
            }
        }
    };

    xhr.send();
});

btnBuscar.addEventListener("click", function(){

    let texto = buscador.value.toLowerCase();
    let tarjetas = document.getElementsByClassName("tarjeta");

    for(let i=0; i<tarjetas.length; i++){
        let nombre = tarjetas[i].getElementsByTagName("h3")[0].textContent.toLowerCase();

        if(nombre.includes(texto)){
            tarjetas[i].style.display="block";
        }else{
            tarjetas[i].style.display="none";
        }
    }
});