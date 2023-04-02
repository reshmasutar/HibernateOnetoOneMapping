package domain;

import javax.persistence.*;

@Entity
@Table(name = "student_info")
public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "stud_id")
        private int Id;
        @Column(name = "stud_name")
        private String studName;
        @Column(name = "stud_contact")
        private int studContact;
        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "eid_ref")
        private Education eidRef;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public int getStudContact() {
        return studContact;
    }

    public void setStudContact(int studContact) {
        this.studContact = studContact;
    }

    public Education getEidRef() {
        return eidRef;
    }

    public void setEidRef(Education eidRef) {
        this.eidRef = eidRef;
    }

    @Override
    public String toString() {
        return  Id +"\t\t"+ studName +"\t\t"+ studContact+"\t\t"+ eidRef ;
    }
}


