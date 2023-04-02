package domain;

import javax.persistence.*;

@Entity
@Table(name = "education_info")
public class Education {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "eid")
        private int eid;
        @Column(name = "ssc")
        private double ssc;
        @Column(name = "hsc")
        private double hsc;
        @Column(name = "degree")
        private double degree;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public double getSsc() {
        return ssc;
    }

    public void setSsc(double ssc) {
        this.ssc = ssc;
    }

    public double getHsc() {
        return hsc;
    }

    public void setHsc(double hsc) {
        this.hsc = hsc;
    }

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return eid +"\t\t"+ ssc +"\t\t"+"\t\t"+ hsc + "\t\t"+degree;
    }
}


