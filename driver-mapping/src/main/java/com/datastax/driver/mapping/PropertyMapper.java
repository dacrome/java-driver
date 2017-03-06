/*
 *      Copyright (C) 2012-2015 DataStax Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.datastax.driver.mapping;

/**
 * Maps a Java bean property to a table column or a UDT field.
 * <p>
 * Properties can be either accessed through getter and setter pairs,
 * or by direct field access, depending on what is available in the
 * entity/UDT class.
 */
class PropertyMapper<T> {

    final MappedProperty<T> mappedProperty;
    final String alias;

    PropertyMapper(MappedProperty<T> mappedProperty, String alias) {
        this.mappedProperty = mappedProperty;
        this.alias = alias;
    }
}
