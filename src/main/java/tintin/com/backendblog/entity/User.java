package tintin.com.backendblog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name")
    private String fullName;
    private String birthday;
    @Column(name = "citizen_identification")
    private String citizenIdentification; // CCCD
    @Column(name = "tax_number")
    private Long taxNumber; // ma so thue
    private String address;
    private String phone;
    private String email;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "company_address")
    private String companyAddress;
    @Column(name = "bank_name")
    private String bankName;
    @Column(name = "bank_account_number")
    private String bankAccountNumber;
    private String school; // for TinTin
}