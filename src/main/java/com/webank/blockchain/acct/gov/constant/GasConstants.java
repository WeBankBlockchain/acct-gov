/**
 * Copyright 2014-2019 the original author or authors.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.webank.blockchain.acct.gov.constant;

import java.math.BigInteger;

/**
 * GasConstants, whose concept was extended from ETH. @Description: GasConstants
 *
 * @author maojiayu
 * @data Dec 28, 2018 5:24:03 PM
 */
public class GasConstants {
    public static final BigInteger GAS_PRICE = new BigInteger("30000000");
    public static final BigInteger GAS_LIMIT = new BigInteger("30000000");
    public static final BigInteger BLOCK_LIMIT = new BigInteger("30000000000");
    public static final BigInteger INITIAL_WEI_VALUE = new BigInteger("0");
}
