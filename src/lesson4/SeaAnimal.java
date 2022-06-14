package lesson4;

public class SeaAnimal {
    private int weight;
    private String researchProject;

    SeaAnimal(int weight, String researchProject) {
        this.weight = weight;
        this.researchProject = researchProject;
    }
    void setWeight (int weight) {
        this.weight = weight;
    }

    int getWeight() {
        return this.weight;
    }

    void setResearchProject(String researchProject) {
        this.researchProject = researchProject;
    }

    String getResearchProject () {
        return this.researchProject;
    }
}
