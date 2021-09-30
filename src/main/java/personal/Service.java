package personal;

import personal.PersonalTrainer;

import java.util.ArrayList;
import java.util.List;

public class Service {

    List<PersonalTrainer> pt = new ArrayList();

//    public List<PersonalTrainer> addPersonal(){
//        pt.add(new PersonalTrainer("adriano", "8468546352"));
//        pt.add(new PersonalTrainer("adriano", "8468546352"));
//        pt.add(new PersonalTrainer("adriano", "8468546352"));
//        pt.add(new PersonalTrainer("adriano", "8468546352"));
//        pt.add(new PersonalTrainer("adriano", "8468546352"));
//        pt.add(new PersonalTrainer("adriano", "8468546352"));
//        pt.add(new PersonalTrainer("adriano", "8468546352"));
//        pt.add(new PersonalTrainer("adriano", "8468546352"));
//        pt.add(new PersonalTrainer("adriano", "8468546352"));
//
//        return pt;
//    }

    public void listPt(){
        for ( PersonalTrainer pt : pt){
            System.out.println(pt);
        }
    }

}
