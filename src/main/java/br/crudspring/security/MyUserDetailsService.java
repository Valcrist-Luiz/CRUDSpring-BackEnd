package br.crudspring.security;

import br.crudspring.models.MyUserDetails;
import br.crudspring.models.User;
import br.crudspring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String nome) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByNome(nome);

        user.orElseThrow(() -> new UsernameNotFoundException("Usuário nao encontrado com o nome: "+nome));

        return user.map(MyUserDetails::new).get();
    }
}
