/*
 * Copyright © 2019 Tinkoff Bank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.tinkoff.vkarmane.sdk

/**
 *  @author Sergei Solodkov
 */
enum class VKarmaneSDKError(val code: Int) {
    UNSUPPORTED_VERSION(1),
    UNKNOWN_ACTION(2),
    BAD_X_CALLBACK_PARAMS(3),
    BAD_ACTION_PARAMS(4),
    INTERNAL_ERROR(5),
    NOT_AUTH(6),
    DECRYPTION_ERROR(7)
}