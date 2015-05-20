package de.colenet.dockerclient;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class DockerClientTest {

	@Test
	public void inspect_returnsNotNull() {
		DockerClient sut = new DockerClient();
		assertThat(sut.inspect("123")).isNotNull();
	}
}
