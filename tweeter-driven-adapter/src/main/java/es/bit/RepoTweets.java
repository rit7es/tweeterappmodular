package es.bit;

import es.bit.models.TweetEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepoTweets extends CrudRepository<TweetEntity,Long>/*, IRepoTweetsPort*/ {
    public List<TweetEntity> findTop10ByTextoContainingIgnoreCase(String tema);
}
