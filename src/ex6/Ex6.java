package ex6;

//importa todas as classes contidas em swing e awt
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Victor Cardoso
 * Vek Histories
 */

//sua classe herda da classe JFrame que contém todas as funções de interface
public class Ex6 extends JFrame
{
    //declarando objetos de rotulo
    JLabel rotulo1,rotulo2, rotulo3, exibir, exibir2, titulo1;
    //declarando objetos de caixa de texto
    JTextField texto1;
    //declarando objeto botão de finalizar programa
    JButton calcular, limpar;
    
    //método construtor contendo todos os atributos da janela de interface
    public Ex6()
    {
        //função que chama a super classe do JFrame
        super("Conversor de Temperatura");
        
        //Container é uma classe que contem todos os obejtos
        Container tela = getContentPane();
        
        //declara o layout como nulo para poder modificá-lo
        setLayout(null);
        
        //instancia de objetos com os valores predefinidos
        rotulo1 = new JLabel("Graus Celsius: ");
        rotulo2 = new JLabel("Graus Fahrenheit: ");
        rotulo3 = new JLabel("Graus Kelvin: ");
        exibir = new JLabel("");
        exibir2 = new JLabel("");
        titulo1 = new JLabel("Conversor de Temperatura");
        
        //instancia de objetos de caixa de texto com tamanho predefinido
        texto1 = new JTextField(15);
        
        //instancia do objeto botão para sair 
        calcular = new JButton("Converter");
        limpar = new JButton("Limpar");
        
        //lugar da janela onde será impresso: margem direita, altura(de cima para baixo), tamanho em caracteres, grossura.  
        //legenda local
        titulo1.setBounds(30,20,300,20);
        rotulo1.setBounds(20,70,200,20);
        rotulo2.setBounds(20,115,200,20);
        rotulo3.setBounds(20,160,200,20);
        
        //resultado local
        exibir.setBounds(130,115,500,20);
        exibir2.setBounds(130,160,500,20);
        
        //caixa de texto local
        texto1.setBounds(130,70,100,20);
       
        //botões local
        calcular.setBounds(20,210,100,20);
        limpar.setBounds(150,210,100,20);
        
        titulo1.setFont(new Font("Arial", Font.BOLD, 17));
        
        //método para limpar caixas de texto
        limpar.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    exibir.setVisible(false);
                    exibir2.setVisible(false);
                    texto1.setText(null);
                    texto1.requestFocus();//passa o foco para está caixa de texto
                }
            }
        );
        
        //método para calculkar a baskara
        calcular.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    double c, f, k;
                    c = Double.parseDouble(texto1.getText());
                    k = c + 273.15;
                    f = (c * 9 / 5) + 32;
                    
                    exibir.setVisible(true);
                    exibir2.setVisible(true);
                    exibir.setText(f + "°F");
                    exibir2.setText(k + "°K");
                }
            }
        );
          
        
        //visibilidade do resultado apenas quando calculo for efetuado
        exibir.setVisible(false);
        exibir2.setVisible(false);
        
        //exibição de tudo
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(exibir);
        tela.add(exibir2);
        tela.add(titulo1);
        
        tela.add(texto1);

        tela.add(calcular);
        tela.add(limpar);
        
        //declarando o tamanho em que a janela deve abrir
        setSize(300, 300);
        
        //visibilidade da janela
        setVisible(true);
        
        //define o local do monitor em que será aberta a janela
        setLocationRelativeTo(null);
    }
    
    //método main
    public static void main(String[] args) 
    {
        //intância de objeto(classe com os atributos)
        Ex6 app = new Ex6();
        //chamando a janela
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
