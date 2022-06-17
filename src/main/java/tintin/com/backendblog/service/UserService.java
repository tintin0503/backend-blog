package tintin.com.backendblog.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import tintin.com.backendblog.dto.UserDto;
import tintin.com.backendblog.entity.User;
import tintin.com.backendblog.repository.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    public List<UserDto> getAll() {
        return userRepository.findAll().stream().map(user -> modelMapper.map(user, UserDto.class))
                .collect(Collectors.toList());
    }

    public UserDto getById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.isPresent() ? modelMapper.map(userOptional.get(), UserDto.class) : null;
    }

    public void save(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        userRepository.save(user);
    }

    public void delete(long id) {
        userRepository.deleteById(id);
    }
}
