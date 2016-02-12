package ch.cyberduck.core.googledrive;

/*
 * Copyright (c) 2002-2016 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import ch.cyberduck.core.Path;
import ch.cyberduck.test.IntegrationTest;

import org.junit.Test;

import java.util.EnumSet;

import static org.junit.Assert.assertFalse;

@IntegrationTest
public class DriveReadFeatureTest {

    @Test
    public void testAppend() throws Exception {
        assertFalse(new DriveReadFeature(null).offset(new Path("/", EnumSet.of(Path.Type.file))));
    }

    @Test
    public void testRead() throws Exception {

    }
}
