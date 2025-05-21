package spring.oauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.oauth.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

    boolean existsByLoginId(String loginId);

    Member findByLoginId(String loginId);
}