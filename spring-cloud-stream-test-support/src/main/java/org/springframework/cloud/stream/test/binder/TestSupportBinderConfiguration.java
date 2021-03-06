/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.stream.test.binder;

import org.springframework.cloud.stream.binder.Binder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.MessageChannel;

/**
 * Binder {@link org.springframework.context.annotation.Configuration} for the
 * {@link @TestBinder}.
 *
 * Either imported by the {@link TestSupportBinderAutoConfiguration} for the test binder
 * default usage scenario (superseding all binders on the classpath), or used as a binder
 * configuration on the classpath when test binder autoconfiguration is disabled.
 *
 * @author Marius Bogoevici
 */
@Configuration
public class TestSupportBinderConfiguration {

	private Binder<MessageChannel, ?, ?> messageChannelBinder = new TestSupportBinder();

	@Bean
	public Binder<MessageChannel, ?, ?> binder() {
		return messageChannelBinder;
	}

}
