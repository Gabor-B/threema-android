/*  _____ _
 * |_   _| |_  _ _ ___ ___ _ __  __ _
 *   | | | ' \| '_/ -_) -_) '  \/ _` |_
 *   |_| |_||_|_| \___\___|_|_|_\__,_(_)
 *
 * Threema for Android
 * Copyright (c) 2017-2021 Threema GmbH
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package ch.threema.base.crypto;


import androidx.annotation.NonNull;

/**
 * Interface for identity stores.
 */
public interface NonceStoreInterface {
	/**
	 * Return true if the given nonce already exists
	 *
	 * @param nonce The nonce bytes
	 */
	boolean exists(@NonNull byte[] nonce);

	/**
	 * Store a nonce
	 *
	 * @param nonce The nonce bytes
	 * @return return true if the nonce was added, false if the nonce already existed
	 */
	boolean store(@NonNull byte[] nonce);
}
