/*
 *  Copyright 2020 Michael Kaisser
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *  See also https://github.com/txtData/nlp
 */

package de.txtdata.asl.nlp.annotators;

import de.txtdata.asl.nlp.models.Language;
import de.txtdata.asl.nlp.models.TextUnit;

/**
 * A Creator is a special type of Annotator that has the additional ability to start an annotation process directly
 * from a text string.
 */
public abstract class AbstractCreator extends AbstractAnnotator {

    public AbstractCreator(Language lang){
        super(lang);
    }

    public abstract TextUnit create(String surface);
}
