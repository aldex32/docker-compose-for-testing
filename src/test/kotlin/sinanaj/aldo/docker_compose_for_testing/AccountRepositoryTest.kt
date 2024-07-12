package sinanaj.aldo.docker_compose_for_testing

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase

@DataJdbcTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class AccountRepositoryTest {

    @Autowired
    lateinit var accountRepository: AccountRepository

    @Test
    fun `should return all accounts`() {
        assertThat(accountRepository.findAll()).isNotEmpty
    }
}