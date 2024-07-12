package sinanaj.aldo.docker_compose_for_testing

import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.annotation.Id
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@SpringBootApplication
class DockerComposeForTestingApplication {

    @Bean
    fun appRunner(accountRepository: AccountRepository): ApplicationRunner {
        return ApplicationRunner {
            println("Stored items: ${accountRepository.findAll()}")
        }
    }
}

fun main(args: Array<String>) {
    runApplication<DockerComposeForTestingApplication>(*args)
}

data class Account(@Id val id: Long, val username: String)

@Repository
interface AccountRepository : CrudRepository<Account, Long>
