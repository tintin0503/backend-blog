package tintin.com.backendblog.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    @JsonProperty("full_name")
    private String fullName;
    private String birthday;
    @JsonProperty("citizen_identification")
    private String citizenIdentification; // CCCD
    @JsonProperty("tax_number")
    private Long taxNumber; // ma so thue
    private String address;
    private String phone;
    private String email;
    @JsonProperty("company_name")
    private String companyName;
    @JsonProperty("company_address")
    private String companyAddress;
    @JsonProperty("bank_name")
    private String bankName;
    @JsonProperty("bank_account_number")
    private String bankAccountNumber;
}