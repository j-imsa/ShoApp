package ir.jimsa.shoapp.config.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static ir.jimsa.shoapp.utility.constant.ProjectConstants.ANONYMOUS_USER;

@Component
@EnableJpaAuditing
public class AuditAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of(ANONYMOUS_USER);
    }
}