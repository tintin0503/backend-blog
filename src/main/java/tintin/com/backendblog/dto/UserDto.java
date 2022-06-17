package tintin.com.backendblog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String fullName;
    private String birthday;
    private String citizenIdentification; // CCCD
    private Long taxNumber; // ma so thue
    private String address;
    private String phone;
    private String email;
    private String companyName;
    private String companyAddress;
    private String bankName;
    private String bankAccountNumber;
    private String school; // for TinTin
}