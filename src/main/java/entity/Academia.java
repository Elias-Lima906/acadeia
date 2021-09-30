package entity;

import personal.PersonalTrainer;

import java.util.ArrayList;
import java.util.List;

public class Academia {

    List<PersonalTrainer> pt = new ArrayList();
    List<Aluno> alunos = new ArrayList();

    public List<PersonalTrainer> addPersonal() {
        pt.add(new PersonalTrainer(1l, "adriano", "8468546352"));
        pt.add(new PersonalTrainer(2l, "adriano", "8468546352"));
        pt.add(new PersonalTrainer(3l, "adriano", "8468546352"));
        pt.add(new PersonalTrainer(4l, "adriano", "8468546352"));
        pt.add(new PersonalTrainer(5l, "adriano", "8468546352"));
        pt.add(new PersonalTrainer(6l, "adriano", "8468546352"));
        pt.add(new PersonalTrainer(7l, "adriano", "8468546352"));
        pt.add(new PersonalTrainer(8l, "adriano", "8468546352"));
        pt.add(new PersonalTrainer(9l, "adriano", "8468546352"));

        return pt;
    }

    public void listPt() {
        for (PersonalTrainer pert : pt) {
            System.out.println(pert.getHorariosDisponiveis());
        }
    }

    public PersonalTrainer buscaPorId(long id) {

        if(id > pt.size()){
            System.out.println("nao da");
        }
        PersonalTrainer pt1 = null;

        for (int i = 0; i < pt.size(); i++) {
            if (pt.get(i).getId() == id) {
                pt1 = pt.get(i);
            }
        }

        return pt1;
    }
}