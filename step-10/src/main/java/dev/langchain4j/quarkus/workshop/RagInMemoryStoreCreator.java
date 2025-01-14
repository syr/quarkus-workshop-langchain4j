package dev.langchain4j.quarkus.workshop;

import dev.langchain4j.store.embedding.EmbeddingStore;
import dev.langchain4j.store.embedding.inmemory.InMemoryEmbeddingStore;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

public class RagInMemoryStoreCreator {

    @Produces
    @ApplicationScoped
    public EmbeddingStore create() {
        return new InMemoryEmbeddingStore();
    }
}