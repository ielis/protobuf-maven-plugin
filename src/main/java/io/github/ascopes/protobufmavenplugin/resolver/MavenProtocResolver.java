/*
 * Copyright (C) 2023, Ashley Scopes.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.ascopes.protobufmavenplugin.resolver;

import java.nio.file.Path;
import org.apache.maven.execution.MavenSession;
import org.eclipse.aether.RepositorySystem;

/**
 * Resolver for {@code protoc} which looks up the provided version in the Maven remote repositories
 * for the project and fetches the desired version prior to returning the path to the executable.
 *
 * @author Ashley Scopes
 */
public final class MavenProtocResolver implements ProtocResolver {

  private final String version;
  private final RepositorySystem repositorySystem;
  private final MavenSession session;

  public MavenProtocResolver(String version, RepositorySystem repositorySystem, MavenSession session) {
    this.version = version;
    this.repositorySystem = repositorySystem;
    this.session = session;
  }

  @Override
  public Path resolveProtoc() throws ProtocResolutionException {
    return null;
  }
}
