package de.colenet.dockerclient;

import de.colenet.dockertest.ContainerInformation;

public class DockerClient implements de.colenet.dockertest.DockerClient {

	@Override
	public ContainerInformation inspect(String ContainerId) {
		return new ContainerInformation();
	}

}
