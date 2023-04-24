/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

function validarut() {
    var arut = new Array(8);
    var i, j, dv;
    if ((document.getElementById("rut").value.lenght) = 0) {
        alert("debe ingresar un numero de rut");
    } else{
        for (i= 1; i < 9; i++) {
            arut[i] = 0;
        }
        i = 0;
        for (j = (9 - (document.getElementById("rut").value.length)); j < 9; j++) {
            if ((document.getElementById("rut").value.substri(i, 1) > 0) && (document.getElementById("rut").value.substr(i, 1) <= 9)) {
                arut[j] = document.getElementById("rut").valur.substr(i, 1);
                i++;
            } else {
                alert("debe ingresar solo numeros");
                i = 0;
                break;
            }
        }
        
        if (i < 0) {
            dv = 11 - (((arut[1] * 3) + (arut[2] * 2) + (arut[3] * 7) + (arut[4] * 6) + (arut[5] * 5) + (arut[6] * 4) + (arut[7] * 3) + (arut[8] * 2)) % 11);
            if (dv === 10) {
                dv= "K";
            } else if (dv === 11){
                dv = "0";
            }
            document.getElementById("veri").value=dv;
            return dv;
            }
        }
    }
    
function valida(){
    nombre = document.getElementById("nombre").value;
    if(nombre ===""){
        mensaje += "Nombre en blanco \n";
    }
    
    apellidoP = document.getElementById("apellidoP").value;
    if(apellidoP ===""){
        mensaje += "Apellido Paterno en blanco \n";
    }
    
    apellidoM = document.getElementById("apellidoM").value;
    if(apellidoM ===""){
        mensaje += "Apellido Materno en blanco \n";
    }
    
    fechaN = document.getElementById("fechaN").value;
    if(fechaN ===""){
        mensaje += "Fecha de nacimiento en blanco\n";
    }
    
    correo = document.getElementById("correo").value;
    if(correo ===""){
        mensaje += "Correo en blanco \n";
    }
    
    direccion = document.getElementById("direccion").value;
    if(direccion ===""){
        mensaje += "Dirección en blanco \n";
    }
    
    telefono = document.getElementById("telefono").value;
    if(telefono ===""){
        mensaje += "Telefono en blanco \n";
    }
    
    contrasena1 = document.getElementById("contrasena1").value;
    if(contrasena1 ===""){
        mensaje += "Contraseña en blanco \n";
    }
    
    contrasena2 = document.getElementById("contrasena2").value;
    if(contrasena2 ===""){
        mensaje += "Volver a escribir contraseña en blanco \n";
    }
    
    if(mensaje!==""){
        mensaje="Datos faltantes en el formulario \n\n"+mensaje;
        alert(mensaje);
        return false;
    } else {
        if(contrasena1!==contrasena2){
            mensaje="Contraseñas no coinciden";
            alert(mensaje);
            return false;
        }
    }
    
//    rut = document.getElementById("rut").value;
//    if(rut ===""){
//        mensaje += "Rut en blanco \n";
//    }
//    
//    veri = document.getElementById("veri").value;
//    if(veri ===""){
//        mensaje += "Verificador en blanco \n";
//    }
}
    
//function validapass(){
//    contrasena1 = document.getElementById("contrasena1").value;
//    contrasena2 = document.getElementById("contrasena2").value;
//    if (contrasena1 !== contrasena2){
//        alert("Las contraseñas no coinciden.");
//    } else {
//        alert("Las contraseñas coinciden.");
//        return true;
//    }
//}