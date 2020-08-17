package aplicaciones.ingles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Farmanimals extends JFrame implements ActionListener {

    JButton burro, caballo, cabra, cerdo, gallo, gato, oveja, pato, pavo, perro, pollito, vaca;
    JLabel titulo, pantalla;
    JPanel panelsuperior, panelinferior;
    JFrame frame;

    public Farmanimals() {
        panelinferior = new JPanel();
        panelsuperior = new JPanel();

        burro = new JButton("Burro - Donkey");
        caballo = new JButton("Caballo - Horse");
        cabra = new JButton("Cabra - Goat");
        cerdo = new JButton("Cerdo - Pork");
        gallo = new JButton("Gallo - Rooster");
        gato = new JButton("Gato - Cat");
        oveja = new JButton("Oveja - Sheep");
        pato = new JButton("Pato - Duck");
        pavo = new JButton("Pavo - Turkey");
        perro = new JButton("Perro - Dog");
        pollito = new JButton("Pollito - Chick");
        vaca = new JButton("Vaca - Cow");

        burro.setIcon(new ImageIcon(getClass().getResource("/Imagen/burro.png")));
        caballo.setIcon(new ImageIcon(getClass().getResource("/Imagen/caballo.png")));
        cabra.setIcon(new ImageIcon(getClass().getResource("/Imagen/cabra.png")));
        cerdo.setIcon(new ImageIcon(getClass().getResource("/Imagen/cerdo.png")));
        gallo.setIcon(new ImageIcon(getClass().getResource("/Imagen/gallo.png")));
        gato.setIcon(new ImageIcon(getClass().getResource("/Imagen/gato.png")));
        oveja.setIcon(new ImageIcon(getClass().getResource("/Imagen/oveja.png")));
        pato.setIcon(new ImageIcon(getClass().getResource("/Imagen/pato.png")));
        pavo.setIcon(new ImageIcon(getClass().getResource("/Imagen/pavo.png")));
        perro.setIcon(new ImageIcon(getClass().getResource("/Imagen/perro.png")));
        pollito.setIcon(new ImageIcon(getClass().getResource("/Imagen/pollito.png")));
        vaca.setIcon(new ImageIcon(getClass().getResource("/Imagen/vaca.png")));

        titulo = new JLabel("ANIMALES DE LA GRANJA - FARM ANIMALS    ");
        pantalla = new JLabel("Seleccione un animal - Select an animal");

        Font origen = new Font("Arial", 0, 35);
        Font otra = new Font("Impact", 0, 50);

        Font botones = new Font("Franklin Gothic Medium", 0, 30);
        titulo.setFont(otra);
        pantalla.setFont(origen);

        burro.setFont(botones);
        caballo.setFont(botones);
        cabra.setFont(botones);
        cerdo.setFont(botones);
        gallo.setFont(botones);
        gato.setFont(botones);
        oveja.setFont(botones);
        pato.setFont(botones);
        pavo.setFont(botones);
        perro.setFont(botones);
        pollito.setFont(botones);
        vaca.setFont(botones);

        burro.setForeground(Color.WHITE);
        caballo.setForeground(Color.WHITE);
        cabra.setForeground(Color.WHITE);
        cerdo.setForeground(Color.WHITE);
        gallo.setForeground(Color.WHITE);
        gato.setForeground(Color.WHITE);
        oveja.setForeground(Color.WHITE);
        pato.setForeground(Color.WHITE);
        pavo.setForeground(Color.WHITE);
        perro.setForeground(Color.WHITE);
        pollito.setForeground(Color.WHITE);
        vaca.setForeground(Color.WHITE);

        panelinferior.setLayout(new GridLayout(4, 3, 50, 30));
        panelinferior.add(burro);
        panelinferior.add(caballo);
        panelinferior.add(cabra);
        panelinferior.add(cerdo);
        panelinferior.add(gallo);
        panelinferior.add(gato);
        panelinferior.add(oveja);
        panelinferior.add(pato);
        panelinferior.add(pavo);
        panelinferior.add(perro);
        panelinferior.add(pollito);
        panelinferior.add(vaca);

        burro.setBackground(new Color(122, 74, 8));
        caballo.setBackground(new Color(122, 74, 8));
        cabra.setBackground(new Color(122, 74, 8));
        cerdo.setBackground(new Color(122, 74, 8));
        gallo.setBackground(new Color(122, 74, 8));
        gato.setBackground(new Color(122, 74, 8));
        oveja.setBackground(new Color(122, 74, 8));
        pato.setBackground(new Color(122, 74, 8));
        pavo.setBackground(new Color(122, 74, 8));
        perro.setBackground(new Color(122, 74, 8));
        pollito.setBackground(new Color(122, 74, 8));
        vaca.setBackground(new Color(122, 74, 8));
        panelsuperior.setBackground(new Color(149, 227, 247));
        panelinferior.setBackground(new Color(94, 192, 73));

        burro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("F:\\TEC\\Topicos\\Unidad 1\\Animales de la granja\\src\\Sonido\\burro.wav");
            }
        });
        caballo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("F:\\TEC\\Topicos\\Unidad 1\\Animales de la granja\\src\\Sonido\\caballo.wav");
            }
        });
        cabra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("F:\\TEC\\Topicos\\Unidad 1\\Animales de la granja\\src\\Sonido\\cabra.wav");
            }
        });
        cerdo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("F:\\TEC\\Topicos\\Unidad 1\\Animales de la granja\\src\\Sonido\\cerdo.wav");
            }
        });
        gallo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("F:\\TEC\\Topicos\\Unidad 1\\Animales de la granja\\src\\Sonido\\gallo.wav");
            }
        });
        gato.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("F:\\TEC\\Topicos\\Unidad 1\\Animales de la granja\\src\\Sonido\\gato.wav");
            }
        });
        oveja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("F:\\TEC\\Topicos\\Unidad 1\\Animales de la granja\\src\\Sonido\\oveja.wav");
            }
        });
        pato.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("F:\\TEC\\Topicos\\Unidad 1\\Animales de la granja\\src\\Sonido\\pato.wav");
            }
        });
        pavo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("F:\\TEC\\Topicos\\Unidad 1\\Animales de la granja\\src\\Sonido\\pavo.wav");
            }
        });
        perro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("F:\\TEC\\Topicos\\Unidad 1\\Animales de la granja\\src\\Sonido\\perro.wav");
            }
        });
        pollito.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("F:\\TEC\\Topicos\\Unidad 1\\Animales de la granja\\src\\Sonido\\pollito.wav");
            }
        });
        vaca.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("F:\\TEC\\Topicos\\Unidad 1\\Animales de la granja\\src\\Sonido\\vaca.wav");
            }
        });

        panelsuperior.add(titulo);
        panelsuperior.add(pantalla);
        frame = new JFrame("ANIMALES DE LA GRANJA - FARM ANIMALS");
        //frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(panelsuperior, BorderLayout.NORTH);
        frame.add(panelinferior, BorderLayout.CENTER);
        //frame.add(panelsuperior);
        //frame.add(panelinferior);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public void ReproducirSonido(String nombreSonido) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(nombreSonido).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
