/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

public class AuthentTest {
    public static void main(String[] args) {
        AutenticaUsuario usuario = new AutenticaUsuario();
        AutenticaUsuario usuarioWhitName = new AutenticaUsuario("Rogerio");
        
        usuario.setUsuario("Etecia");
        usuario.setSenha("etecia");
        
        System.out.println("Usuario: "+usuario.getUsuario());
        System.out.println("Senha: "+usuario.getSenha());
        
        
        System.out.println("Usuario pré definido: "+usuarioWhitName.getUsuario());
        
    }
}
