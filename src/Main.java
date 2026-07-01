import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Spring");
        curso2.setDescricao("Curso de Spring");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Tira dúvidas");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp completo");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVinicius = new Dev();
        devVinicius.setNome("Vinicius");

        devVinicius.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos:");
        System.out.println(devVinicius.getConteudosInscritos());

        devVinicius.progredir();
        devVinicius.progredir();

        System.out.println("Concluídos:");
        System.out.println(devVinicius.getConteudosConcluidos());

        System.out.println("XP:");
        System.out.println(devVinicius.calcularTotalXp());
    }
}