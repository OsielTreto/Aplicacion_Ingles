package aplicaciones.ingles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class AplicacionesIngles extends JFrame implements ActionListener {

    JFrame principal;
    JPanel panel;
    JButton colors, farmanimal, partsbody, jungleanimals, planets, food, numbers, vowels;

    JButton Head, Chest, Arm, Leg, Hand, Foot, Ear, Eye, Mouth, Nose;
    JPanel superior, inferior;
    JFrame frame;
    JLabel texto;

    JButton burro, caballo, cabra, cerdo, gallo, gato, oveja, pato, pavo, perro, pollito, vaca;
    JLabel titulo, pantalla;
    JPanel panelsuperior, panelinferior;

    JButton negro, morado, cyan, azulmarino, verde, amarillo, magenta, rojo, rosa, cafe, turqueza, naranja;

    JButton uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero;

    JButton a, e, i, o, u;

    JButton araña, buho, chimpance, cocodrilo, elefante, hipopotamo, rana, tigre;

    JButton jupiter, marte, mercurio, neptuno, saturno, tierra, urano, venus;

    JButton hamburguesa, pizza, ensalada, entomatadas, enchiladas, tacosDeCecina, tamales, tostadas;

    public AplicacionesIngles() {

        colors = new JButton();
        farmanimal = new JButton();
        partsbody = new JButton();
        jungleanimals = new JButton();
        planets = new JButton();
        food = new JButton();
        numbers = new JButton();
        vowels = new JButton();

        colors.setIcon(new ImageIcon(getClass().getResource("/principal/colors.jpeg")));
        farmanimal.setIcon(new ImageIcon(getClass().getResource("/principal/farmanimals.jpeg")));
        partsbody.setIcon(new ImageIcon(getClass().getResource("/principal/body.jpeg")));
        jungleanimals.setIcon(new ImageIcon(getClass().getResource("/principal/jungleanimals.jpeg")));
        planets.setIcon(new ImageIcon(getClass().getResource("/principal/planets.jpeg")));
        food.setIcon(new ImageIcon(getClass().getResource("/principal/food.jpeg")));
        numbers.setIcon(new ImageIcon(getClass().getResource("/principal/numbers.jpeg")));
        vowels.setIcon(new ImageIcon(getClass().getResource("/principal/vowels.jpeg")));

        colors.setBackground(new Color(125, 14, 20));
        farmanimal.setBackground(new Color(155, 166, 10));
        partsbody.setBackground(Color.WHITE);
        jungleanimals.setBackground(new Color(89, 159, 27));
        planets.setBackground(new Color(43, 43, 43));
        food.setBackground(new Color(228, 168, 116));
        numbers.setBackground(new Color(216, 217, 221));
        vowels.setBackground(new Color(255, 255, 251));

        colors.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ColoresSonido();
            }
        });
        farmanimal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AnimalesDeLaGranja();
            }
        });
        partsbody.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PartesDelCuerpo();
            }
        });
        jungleanimals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Jungla();
            }
        });
        planets.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Planetas();
            }
        });
        food.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Comida();
            }
        });
        numbers.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Numeros();
            }
        });
        vowels.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Vocales();
            }
        });

        panel = new JPanel();
        panel.setLayout(new GridLayout(2, 4, 5, 5));
        panel.add(colors);
        panel.add(farmanimal);
        panel.add(partsbody);
        panel.add(jungleanimals);
        panel.add(planets);
        panel.add(food);
        panel.add(numbers);
        panel.add(vowels);

        principal = new JFrame("Applications in English");
        //principal.setSize(300, 300);
        principal.add(panel, BorderLayout.CENTER);
        principal.pack();
        principal.setVisible(true);
        principal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public void PartesDelCuerpo() {
        Font x = new Font("Arial", 0, 35);
        texto = new JLabel("Select an icon");
        texto.setFont(x);

        Head = new JButton();
        Chest = new JButton();
        Arm = new JButton();
        Leg = new JButton();
        Hand = new JButton();
        Foot = new JButton();
        Ear = new JButton();
        Eye = new JButton();
        Mouth = new JButton();
        Nose = new JButton();

        Head.setBackground(Color.WHITE);
        Chest.setBackground(Color.WHITE);
        Arm.setBackground(Color.WHITE);
        Leg.setBackground(Color.WHITE);
        Hand.setBackground(Color.WHITE);
        Foot.setBackground(Color.WHITE);
        Ear.setBackground(Color.WHITE);
        Eye.setBackground(Color.WHITE);
        Mouth.setBackground(Color.WHITE);
        Nose.setBackground(Color.WHITE);

        Head.setIcon(new ImageIcon(getClass().getResource("/partsbody/cabeza.png")));
        Chest.setIcon(new ImageIcon(getClass().getResource("/partsbody/pecho.jpeg")));
        Arm.setIcon(new ImageIcon(getClass().getResource("/partsbody/brazos.png")));
        Leg.setIcon(new ImageIcon(getClass().getResource("/partsbody/piernas.jpeg")));
        Hand.setIcon(new ImageIcon(getClass().getResource("/partsbody/manos.png")));
        Foot.setIcon(new ImageIcon(getClass().getResource("/partsbody/pie.jpeg")));
        Ear.setIcon(new ImageIcon(getClass().getResource("/partsbody/oreja.png")));
        Eye.setIcon(new ImageIcon(getClass().getResource("/partsbody/ojos.jpeg")));
        Mouth.setIcon(new ImageIcon(getClass().getResource("/partsbody/boca.png")));
        Nose.setIcon(new ImageIcon(getClass().getResource("/partsbody/nariz.jpeg")));

        Head.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("Name: Head");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\partsbody\\Head.wav");

            }
        });
        Chest.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("Name: Chest");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\partsbody\\Chest.wav");

            }
        });
        Arm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("Name: Arm");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\partsbody\\Arm.wav");

            }
        });
        Leg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("Name: Leg");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\partsbody\\Leg.wav");

            }
        });
        Hand.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("Name: Hand");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\partsbody\\Hand.wav");

            }
        });
        Foot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("Name: Foot");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\partsbody\\Foot.wav");

            }
        });
        Ear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("Name: Ear");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\partsbody\\Ear.wav");

            }
        });
        Eye.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("Name: Eye");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\partsbody\\Eye.wav");

            }
        });
        Mouth.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("Name: Mouth");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\partsbody\\Mouth.wav");

            }
        });
        Nose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("Name: Nose");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\partsbody\\Nose.wav");

            }
        });

        superior = new JPanel();
        inferior = new JPanel();

        superior.setBackground(Color.CYAN);
        inferior.setBackground(Color.yellow);
        superior.add(texto);

        inferior.add(Head);
        inferior.add(Chest);
        inferior.add(Arm);
        inferior.add(Leg);
        inferior.add(Hand);
        inferior.add(Foot);
        inferior.add(Ear);
        inferior.add(Eye);
        inferior.add(Mouth);
        inferior.add(Nose);

        inferior.setLayout(new GridLayout(2, 4, 5, 5));
        frame = new JFrame("Body parts");
        //principal.setSize(300, 300);
        frame.add(superior, BorderLayout.NORTH);
        frame.add(inferior, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public void AnimalesDeLaGranja() {
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

        burro.setIcon(new ImageIcon(getClass().getResource("/farmanimal/burro.png")));
        caballo.setIcon(new ImageIcon(getClass().getResource("/farmanimal/caballo.png")));
        cabra.setIcon(new ImageIcon(getClass().getResource("/farmanimal/cabra.png")));
        cerdo.setIcon(new ImageIcon(getClass().getResource("/farmanimal/cerdo.png")));
        gallo.setIcon(new ImageIcon(getClass().getResource("/farmanimal/gallo.png")));
        gato.setIcon(new ImageIcon(getClass().getResource("/farmanimal/gato.png")));
        oveja.setIcon(new ImageIcon(getClass().getResource("/farmanimal/oveja.png")));
        pato.setIcon(new ImageIcon(getClass().getResource("/farmanimal/pato.png")));
        pavo.setIcon(new ImageIcon(getClass().getResource("/farmanimal/pavo.png")));
        perro.setIcon(new ImageIcon(getClass().getResource("/farmanimal/perro.png")));
        pollito.setIcon(new ImageIcon(getClass().getResource("/farmanimal/pollito.png")));
        vaca.setIcon(new ImageIcon(getClass().getResource("/farmanimal/vaca.png")));

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
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\farmanimal\\burro.wav");
            }
        });
        caballo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\farmanimal\\caballo.wav");
            }
        });
        cabra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\farmanimal\\cabra.wav");
            }
        });
        cerdo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\farmanimal\\cerdo.wav");
            }
        });
        gallo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\farmanimal\\gallo.wav");
            }
        });
        gato.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\farmanimal\\gato.wav");
            }
        });
        oveja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\farmanimal\\oveja.wav");
            }
        });
        pato.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\farmanimal\\pato.wav");
            }
        });
        pavo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\farmanimal\\pavo.wav");
            }
        });
        perro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\farmanimal\\perro.wav");
            }
        });
        pollito.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\farmanimal\\pollito.wav");
            }
        });
        vaca.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\farmanimal\\vaca.wav");
            }
        });

        panelsuperior.add(titulo);
        panelsuperior.add(pantalla);
        frame = new JFrame("ANIMALES DE LA GRANJA - FARM ANIMALS");
        //frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(panelsuperior, BorderLayout.NORTH);
        frame.add(panelinferior, BorderLayout.CENTER);
        //frame.add(panelsuperior);-
        //frame.add(panelinferior);
        frame.pack();
        frame.setVisible(true);

    }

    public void ColoresSonido() {
        //setSize(500,500);
        negro = new JButton();
        morado = new JButton();
        cyan = new JButton();
        azulmarino = new JButton();
        verde = new JButton();
        amarillo = new JButton();
        magenta = new JButton();
        rojo = new JButton();
        rosa = new JButton();
        cafe = new JButton();
        turqueza = new JButton();
        naranja = new JButton();
        pantalla = new JLabel();
        Font origen = new Font("Arial", 0, 35);
        pantalla.setText("Seleccione un color - Select a color");

        pantalla.setFont(origen);
        panelinferior = new JPanel();
        panelsuperior = new JPanel();

        panelinferior.setLayout(new GridLayout(4, 3, 5, 5));
        //panelsuperior.setLayout(new FlowLayout());
        panelsuperior.add(pantalla);
        negro.setBackground(Color.BLACK);
        morado.setBackground(new Color(98, 0, 165));
        cyan.setBackground(Color.cyan);
        azulmarino.setBackground(new Color(13, 31, 255));
        verde.setBackground(Color.GREEN);
        amarillo.setBackground(Color.YELLOW);
        magenta.setBackground(new Color(163, 73, 164));
        rojo.setBackground(Color.RED);
        rosa.setBackground(new Color(255, 79, 167));
        cafe.setBackground(new Color(185, 122, 87));
        turqueza.setBackground(new Color(40, 179, 180));
        naranja.setBackground(Color.ORANGE);

        negro.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("Seleccionaste el color Negro - Black");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\colors\\black.wav");
            }
        }
        );
        morado.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("Seleccionaste el color Morado - Purple");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\colors\\purple.wav");
            }
        }
        );
        cyan.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("Seleccionaste el color Cian - Cyan");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\colors\\cyan.wav");
            }
        }
        );
        azulmarino.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("Seleccionaste el color Azul marino - Navy blue");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\colors\\navy_blue.wav");
            }
        }
        );
        verde.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("Seleccionaste el color Verde - Green");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\colors\\green.wav");
            }
        }
        );
        amarillo.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("Seleccionaste el color Amarillo - Yellow");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\colors\\yellow.wav");
            }
        }
        );
        magenta.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("Seleccionaste el color Magenta - Magenta");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\colors\\magenta.wav");
            }
        }
        );
        rojo.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("Seleccionaste el color Rojo - Red");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\colors\\Red.wav");
            }
        }
        );
        rosa.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("Seleccionaste el color Rosa - Pink");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\colors\\pink.wav");
            }
        }
        );
        cafe.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("Seleccionaste el color Cafe - Brown");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\colors\\Brown_.wav");
            }
        }
        );
        turqueza.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("Seleccionaste el color Turquesa - Turquoise");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\colors\\turquoise.wav");
            }
        }
        );
        naranja.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("Seleccionaste el color Naranja - Orange");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\colors\\Orange.wav");
            }
        }
        );
        panelsuperior.setBackground(Color.WHITE);
        panelinferior.setBackground(Color.DARK_GRAY);
        panelinferior.add(negro);
        panelinferior.add(morado);
        panelinferior.add(cyan);
        panelinferior.add(azulmarino);
        panelinferior.add(verde);
        panelinferior.add(amarillo);
        panelinferior.add(magenta);
        panelinferior.add(rojo);
        panelinferior.add(rosa);
        panelinferior.add(cafe);
        panelinferior.add(turqueza);
        panelinferior.add(naranja);

        frame = new JFrame("COLORES - COLORS");
        frame.setSize(800, 800);
        //frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(panelsuperior, BorderLayout.NORTH);
        frame.add(panelinferior, BorderLayout.CENTER);
        //frame.add(panelsuperior);
        frame.add(panelinferior);
        //frame.pack();
        frame.setVisible(true);

    }

    public void Numeros() {
        Font x = new Font("Arial", 0, 35);
        texto = new JLabel("Select a number");
        texto.setFont(x);

        uno = new JButton();
        dos = new JButton();
        tres = new JButton();
        cuatro = new JButton();
        cinco = new JButton();
        seis = new JButton();
        siete = new JButton();
        ocho = new JButton();
        nueve = new JButton();
        cero = new JButton();

        uno.setBackground(Color.WHITE);
        dos.setBackground(Color.WHITE);
        tres.setBackground(Color.WHITE);
        cuatro.setBackground(Color.WHITE);
        cinco.setBackground(Color.WHITE);
        seis.setBackground(Color.WHITE);
        siete.setBackground(Color.WHITE);
        ocho.setBackground(Color.WHITE);
        nueve.setBackground(Color.WHITE);
        cero.setBackground(Color.WHITE);

        uno.setIcon(new ImageIcon(getClass().getResource("/numbers/uno.jpeg")));
        dos.setIcon(new ImageIcon(getClass().getResource("/numbers/dos.jpeg")));
        tres.setIcon(new ImageIcon(getClass().getResource("/numbers/tres.jpeg")));
        cuatro.setIcon(new ImageIcon(getClass().getResource("/numbers/cuatro.jpeg")));
        cinco.setIcon(new ImageIcon(getClass().getResource("/numbers/cinco.jpeg")));
        seis.setIcon(new ImageIcon(getClass().getResource("/numbers/seis.jpeg")));
        siete.setIcon(new ImageIcon(getClass().getResource("/numbers/siete.jpeg")));
        ocho.setIcon(new ImageIcon(getClass().getResource("/numbers/ocho.jpeg")));
        nueve.setIcon(new ImageIcon(getClass().getResource("/numbers/nueve.jpeg")));
        cero.setIcon(new ImageIcon(getClass().getResource("/numbers/cero.jpeg")));

        uno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("One");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\numbers\\1.wav");

            }
        });
        dos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("Two");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\numbers\\2.wav");

            }
        });
        tres.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("Three");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\numbers\\3.wav");

            }
        });
        cuatro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("Four");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\numbers\\4.wav");

            }
        });
        cinco.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("Five");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\numbers\\5.wav");

            }
        });
        seis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("Six");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\numbers\\6.wav");

            }
        });
        siete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("Seven");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\numbers\\7.wav");

            }
        });
        ocho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("Eight");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\numbers\\8.wav");

            }
        });
        nueve.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("Nine");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\numbers\\9.wav");

            }
        });
        cero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("Zero");
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\numbers\\0.wav");

            }
        });

        superior = new JPanel();
        inferior = new JPanel();

        superior.setBackground(new Color(0, 162, 232));
        inferior.setBackground(Color.MAGENTA);
        superior.add(texto);

        inferior.add(cero);
        inferior.add(uno);
        inferior.add(dos);
        inferior.add(tres);
        inferior.add(cuatro);
        inferior.add(cinco);
        inferior.add(seis);
        inferior.add(siete);
        inferior.add(ocho);
        inferior.add(nueve);

        inferior.setLayout(new GridLayout(2, 4, 5, 5));
        frame = new JFrame("Numbers");
        //principal.setSize(300, 300);
        frame.add(superior, BorderLayout.NORTH);
        frame.add(inferior, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public void Vocales() {
        Font x = new Font("Arial", 0, 35);
        JLabel texto2 = new JLabel();

        texto2 = new JLabel("Select a vowel to listen to the pronunciation");
        texto2.setFont(x);
        texto2.setForeground(Color.WHITE);

        a = new JButton();
        e = new JButton();
        i = new JButton();
        o = new JButton();
        u = new JButton();

        a.setBackground(Color.WHITE);
        e.setBackground(Color.WHITE);
        i.setBackground(Color.WHITE);
        o.setBackground(Color.WHITE);
        u.setBackground(Color.WHITE);

        a.setIcon(new ImageIcon(getClass().getResource("/vowels/a.jpeg")));
        e.setIcon(new ImageIcon(getClass().getResource("/vowels/e.jpeg")));
        i.setIcon(new ImageIcon(getClass().getResource("/vowels/i.jpeg")));
        o.setIcon(new ImageIcon(getClass().getResource("/vowels/o.jpeg")));
        u.setIcon(new ImageIcon(getClass().getResource("/vowels/u.jpeg")));

        a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\vowels\\a.wav");

            }
        });
        e.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\vowels\\e.wav");

            }
        });
        i.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\vowels\\i.wav");

            }
        });
        o.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\vowels\\o.wav");

            }
        });
        u.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\vowels\\u.wav");

            }
        });

        superior = new JPanel();
        inferior = new JPanel();

        superior.setBackground(Color.DARK_GRAY);
        inferior.setBackground(Color.RED);
        superior.add(texto2);

        inferior.add(a);
        inferior.add(e);
        inferior.add(i);
        inferior.add(o);
        inferior.add(u);

        inferior.setLayout(new GridLayout(3, 2, 5, 5));
        frame = new JFrame("Vowels");
        //principal.setSize(300, 300);
        frame.add(superior, BorderLayout.NORTH);
        frame.add(inferior, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public void Jungla() {
        Font x = new Font("Arial", 0, 35);
        Font botones = new Font("Franklin Gothic Medium", 0, 30);
        texto = new JLabel("Select an animal");
        texto.setFont(x);

        araña = new JButton("Spider");
        buho = new JButton("Owl");
        chimpance = new JButton("Chimpanzee");
        cocodrilo = new JButton("Crocodile");
        elefante = new JButton("Elephant");
        hipopotamo = new JButton("Hippopotamus");
        rana = new JButton("Frog");
        tigre = new JButton("Tiger");

        araña.setFont(botones);
        buho.setFont(botones);
        chimpance.setFont(botones);
        cocodrilo.setFont(botones);
        elefante.setFont(botones);
        hipopotamo.setFont(botones);
        rana.setFont(botones);
        tigre.setFont(botones);

        araña.setForeground(Color.WHITE);
        buho.setForeground(Color.WHITE);
        chimpance.setForeground(Color.WHITE);
        cocodrilo.setForeground(Color.WHITE);
        elefante.setForeground(Color.WHITE);
        hipopotamo.setForeground(Color.WHITE);
        rana.setForeground(Color.WHITE);
        tigre.setForeground(Color.WHITE);

        araña.setBackground(new Color(52, 88, 24));
        buho.setBackground(new Color(52, 88, 24));
        chimpance.setBackground(new Color(52, 88, 24));
        cocodrilo.setBackground(new Color(52, 88, 24));
        elefante.setBackground(new Color(52, 88, 24));
        hipopotamo.setBackground(new Color(52, 88, 24));
        rana.setBackground(new Color(52, 88, 24));
        tigre.setBackground(new Color(52, 88, 24));

        araña.setIcon(new ImageIcon(getClass().getResource("/jungleanimals/ARAÑA.png")));
        buho.setIcon(new ImageIcon(getClass().getResource("/jungleanimals/Buho.png")));
        chimpance.setIcon(new ImageIcon(getClass().getResource("/jungleanimals/chimpance.png")));
        cocodrilo.setIcon(new ImageIcon(getClass().getResource("/jungleanimals/cocodrilo.png")));
        elefante.setIcon(new ImageIcon(getClass().getResource("/jungleanimals/elefante.png")));
        hipopotamo.setIcon(new ImageIcon(getClass().getResource("/jungleanimals/hopopotamo.png")));
        rana.setIcon(new ImageIcon(getClass().getResource("/jungleanimals/rana.png")));
        tigre.setIcon(new ImageIcon(getClass().getResource("/jungleanimals/tigre.png")));

        araña.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\jungleanimals\\araña.wav");

            }
        });
        buho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\jungleanimals\\buho.wav");

            }
        });
        chimpance.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\jungleanimals\\chimpance.wav");

            }
        });
        cocodrilo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\jungleanimals\\cocodrilo.wav");

            }
        });
        elefante.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\jungleanimals\\elefante.wav");

            }
        });
        hipopotamo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\jungleanimals\\hipopotamo.wav");

            }
        });
        rana.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\jungleanimals\\rana.wav");

            }
        });
        tigre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\jungleanimals\\tigre.wav");

            }
        });

        superior = new JPanel();
        inferior = new JPanel();

        superior.setBackground(new Color(60, 153, 220));
        inferior.setBackground(new Color(94, 158, 22));
        superior.add(texto);

        inferior.add(araña);
        inferior.add(buho);
        inferior.add(chimpance);
        inferior.add(cocodrilo);
        inferior.add(elefante);
        inferior.add(hipopotamo);
        inferior.add(rana);
        inferior.add(tigre);

        inferior.setLayout(new GridLayout(4, 2, 10, 10));
        frame = new JFrame("Jungle animals");
        //principal.setSize(300, 300);
        frame.add(superior, BorderLayout.NORTH);
        frame.add(inferior, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new AplicacionesIngles();
    }

    public void Planetas() {
        Font x = new Font("Arial", 0, 35);
        texto = new JLabel("Select a planet");
        texto.setFont(x);

        jupiter = new JButton();
        marte = new JButton();
        mercurio = new JButton();
        neptuno = new JButton();
        saturno = new JButton();
        tierra = new JButton();
        urano = new JButton();
        venus = new JButton();

        mercurio.setBackground(Color.BLACK);
        venus.setBackground(Color.BLACK);
        tierra.setBackground(Color.BLACK);
        marte.setBackground(Color.BLACK);
        jupiter.setBackground(Color.BLACK);
        saturno.setBackground(Color.BLACK);
        urano.setBackground(Color.BLACK);
        neptuno.setBackground(Color.BLACK);

        jupiter.setIcon(new ImageIcon(getClass().getResource("/planets/jupiter.png")));
        marte.setIcon(new ImageIcon(getClass().getResource("/planets/marte.png")));
        mercurio.setIcon(new ImageIcon(getClass().getResource("/planets/mercurio.png")));
        neptuno.setIcon(new ImageIcon(getClass().getResource("/planets/neptuno.png")));
        saturno.setIcon(new ImageIcon(getClass().getResource("/planets/saturno.png")));
        tierra.setIcon(new ImageIcon(getClass().getResource("/planets/tierra.png")));
        urano.setIcon(new ImageIcon(getClass().getResource("/planets/urano.png")));
        venus.setIcon(new ImageIcon(getClass().getResource("/planets/venus.png")));

        mercurio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\planets\\mercurio.wav");
                texto.setText("Mercury");
            }
        });
        
        venus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\planets\\venus.wav");
                texto.setText("Venus");
            }
        });
        
        tierra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\planets\\tierra.wav");
                texto.setText("Earth");
            }
        });
        
        marte.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\planets\\marte.wav");
                texto.setText("Mars");
            }
        });
        
        jupiter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\planets\\jupiter.wav");
                texto.setText("Jupiter");
            }
        });
        
        saturno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\planets\\saturno.wav");
                texto.setText("Saturn");
            }
        });
        
        urano.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\planets\\urano.wav");
                texto.setText("Uranus");
            }
        });
        
        neptuno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\planets\\neptuno.wav");
                texto.setText("Neptune");
            }
        });

        superior = new JPanel();
        inferior = new JPanel();

        inferior.add(mercurio);
        inferior.add(venus);
        inferior.add(tierra);
        inferior.add(marte);
        inferior.add(jupiter);
        inferior.add(saturno);
        inferior.add(urano);
        inferior.add(neptuno);

        superior.setBackground(Color.CYAN);
        inferior.setBackground(Color.yellow);
        superior.add(texto);
        inferior.setLayout(new GridLayout(2, 4, 5, 5));
        frame = new JFrame("Planets");
        //principal.setSize(300, 300);
        frame.add(superior, BorderLayout.NORTH);
        frame.add(inferior, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    public void Comida() {
        Font x = new Font("Arial", 0, 35);
        texto = new JLabel("Select a food");
        texto.setFont(x);

        hamburguesa = new JButton();
        pizza = new JButton();
        ensalada = new JButton();
        entomatadas = new JButton();
        enchiladas = new JButton();
        tacosDeCecina = new JButton();
        tamales = new JButton();
        tostadas = new JButton();

        superior = new JPanel();
        inferior = new JPanel();

        hamburguesa.setBackground(Color.WHITE);
        pizza.setBackground(Color.WHITE);
        ensalada.setBackground(Color.WHITE);
        entomatadas.setBackground(Color.WHITE);
        enchiladas.setBackground(Color.WHITE);
        tacosDeCecina.setBackground(Color.WHITE);
        tamales.setBackground(Color.WHITE);
        tostadas.setBackground(Color.WHITE);

        hamburguesa.setIcon(new ImageIcon(getClass().getResource("/food/hamburguesa.png")));
        pizza.setIcon(new ImageIcon(getClass().getResource("/food/pizza.png")));
        ensalada.setIcon(new ImageIcon(getClass().getResource("/food/ensalada.png")));
        entomatadas.setIcon(new ImageIcon(getClass().getResource("/food/entomatadas.png")));
        enchiladas.setIcon(new ImageIcon(getClass().getResource("/food/enchiladas.jpeg")));
        tacosDeCecina.setIcon(new ImageIcon(getClass().getResource("/food/hamburguesa.png")));
        tamales.setIcon(new ImageIcon(getClass().getResource("/food/tacos.png")));
        tostadas.setIcon(new ImageIcon(getClass().getResource("/food/tostadas.png")));

        hamburguesa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\food\\hamburguesa.wav");
                texto.setText("Burger");
            }
        });

        pizza.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\food\\pizza.wav");
                texto.setText("Pizza");
            }
        });
        ensalada.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\food\\ensalada.wav");
                texto.setText("Salad");
            }
        });
        entomatadas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\food\\entomatadas.wav");
                texto.setText("Entomatadas");
            }
        });
        enchiladas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\food\\enchiladas.wav");
                texto.setText("Enchiladas");
            }
        });
        tacosDeCecina.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\food\\tacos.wav");
                texto.setText("Cured meat tacos");
            }
        });
        tamales.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\food\\tamales.wav");
                texto.setText("Tamales");
            }
        });
        tostadas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReproducirSonido("D:\\TEC\\Topicos\\Unidad 2\\Aplicaciones Ingles\\src\\food\\tostadas.wav");
                texto.setText("Toasts");
            }
        });

        inferior.add(hamburguesa);
        inferior.add(pizza);
        inferior.add(ensalada);
        inferior.add(entomatadas);
        inferior.add(enchiladas);
        inferior.add(tacosDeCecina);
        inferior.add(tamales);
        inferior.add(tostadas);

        superior.setBackground(Color.LIGHT_GRAY);
        inferior.setBackground(Color.red);
        superior.add(texto);
        inferior.setLayout(new GridLayout(2, 4, 5, 5));
        frame = new JFrame("Food");
        //principal.setSize(300, 300);
        frame.add(superior, BorderLayout.NORTH);
        frame.add(inferior, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
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
    }

}
