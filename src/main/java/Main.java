import entity.Academia;
import personal.PersonalTrainer;

import java.util.List;

public class Main {
    public static void main(String[] args) {


//        System.out.println("ben vindo");
//
//        System.out.println("Listar pt");
//
//            System.out.println("escolha um");

    //            System.out.println("Listar aulas");
    //            System.out.println("Ver horarios disponíveis");
    //            System.out.println("agendar");
//
//
//
//
//
//
//
        Academia academia = new Academia();

        List<PersonalTrainer> personalTrainers = academia.addPersonal();

        PersonalTrainer personalTrainer = academia.buscaPorId(5l);

        System.out.println(personalTrainer.getHorariosDisponiveis());



    }
    }

